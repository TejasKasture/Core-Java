/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Administrator
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class sendMessage {

    public static void sendSms(String message, String number) {
        try {
            String apiKey = "hfImq47MmHkOThexWvt2JAXOyAVx1a4lXHTSTlsOo2sAkl2CGRFs2BJ9KsH5"; // API Key
            String sendId = "FSTSMS"; // Sender ID
            message = URLEncoder.encode(message, "UTF-8"); // Encode message
            number = URLEncoder.encode(number, "UTF-8"); // Encode phone number
            String language = "english";
            String route = "p"; // or "t" depending on the route

            String myUrl = "https://www.fast2sms.com/dev/bulk?authorization=" + apiKey
                         + "&sender_id=" + sendId
                         + "&message=" + message
                         + "&language=" + language
                         + "&route=" + route
                         + "&numbers=" + number;

            System.out.println("Final URL: " + myUrl);

            URL url = new URL(myUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            con.setRequestProperty("Cache-Control", "no-cache");//https://www.fast2sms.com/dev/bulkV2

            System.out.println("Wait..............");

            int code = con.getResponseCode();
            System.out.println("Response code: " + code);

            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            br.close(); // Close BufferedReader

            if (response.length() == 0) {
                System.out.println("No response from the server.");
            } else {
                System.out.println("Response from server: " + response.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Program started.....");
        sendSms("Hello from Tejas", "9373914200"); // Corrected number format
    }
}






