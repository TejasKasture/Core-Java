/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Administrator
 */
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//
//public class SendSMS {
//    // Replace with your Twilio account SID and Auth Token
//    public static final String ACCOUNT_SID = "AC8a3dd1dbf48e8eb687000fb3449410b2";
//    public static final String AUTH_TOKEN = "92da9ece0b22d453a9b9039de158619f";
//
//    public static void main(String[] args) {
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//
//        // Twilio number and recipient number
//        String fromNumber = "+19362255641"; // Your Twilio number
//        String toNumber = "+919373914200"; // Replace with the recipient's number
//
//        Message message = Message.creator(
//                new PhoneNumber(toNumber),
//                new PhoneNumber(fromNumber),
//                "Hello! This is a message from Twilio."
//        ).create();
//
//        System.out.println("Message sent successfully! SID: " + message.getSid());
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SendSMS {

    public static void sendSMS(String otpStr) {
        try {
            // Your TextLocal API Key
            String apiKey = "apiKey=" + "NTQzNzZlNjE2ZjU1NmU0NjQ2MzM2MjQ3NDk1OTc3NmU=";  // Replace with your actual API Key
            
            // Message to send (encode the message)
            String message = "&message=" + URLEncoder.encode("Your OTP is " + otpStr, "UTF-8");

            
            // Recipient's phone number (replace with actual numbers)
            String numbers = "&numbers=" + "91"+"9373914200";  // Replace with the actual phone number (including country code)

            // Prepare the API URL to call TextLocal service
            String apiURL = "https://api.textlocal.in/send/?" + apiKey + message + numbers;
            
            // Create a connection to the URL
            URL url = new URL(apiURL);
            URLConnection connection = url.openConnection();
            connection.setDoOutput(true);  // Ensure we can read the response
            
            // Read the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
            String line = "";
            StringBuilder sb = new StringBuilder();
            
            // Append each line of the response to StringBuilder
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            
            // Print the response (optional, for debugging)
            System.out.println("Response from API: " + sb.toString());
        } catch (Exception e) {
            e.printStackTrace();  // Handle any exceptions
        }
    }

//    public static void main(String[] args) {
//        // Example OTP for testing
//        String otp = "123456";//"STD"+2024+"@"+"1";//
//        
//        sendSMS(otp);
//    }
    
    public static void main(String[] args) {
         
        try {
            // Construct data
            String apiKey = "apikey=" + "NTQzNzZlNjE2ZjU1NmU0NjQ2MzM2MjQ3NDk1OTc3NmU=";
            String message = "&message="+ URLEncoder.encode("Your OTP is " +"1234", "UTF-8");;

            String sender = "&sender=" + "TXTLCL";
            String numbers = "&numbers=" + "9373914200";
 
            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message+sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
             
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line).append("\n");
            }
            System.out.println(stringBuffer.toString());
            rd.close();
 
 
        } catch (Exception e) {
           e.printStackTrace();
        }


        

    }
}


