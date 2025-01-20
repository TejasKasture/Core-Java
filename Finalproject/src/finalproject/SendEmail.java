/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Administrator
 */
//public class SendEmail
//{
//    
//}


import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmail 
{
    
	public static void main(String[] args) 
        {
		
		System.out.println("preparing to send message ...");
		String message = "Hello , Dear, this is message for security check . ";
		String subject = "CodersArea : Confirmation";
		String to = "kasture099@gmail.com";
		String from = "tejaskasture01@gmail.com";
		
		SendEmail.sendEmail(message,subject,to,from);
		//sendAttach(message,subject,to,from);
	}

	//this is responsible to send the message with attachment
	private static void sendAttach(String message, String subject, String to, String from) {

		//Variable for gmail
		String host="smtp.gmail.com";
		
		//get the system properties
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+properties);
		
		//setting important information to properties object
		
		//host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smtp.auth","true");
		
		//Step 1: to get the session object..
		Session session=Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {				
				return new PasswordAuthentication("tejaskasture01@gmail.com", "*******");
			}
			
			
			
		});
		
		session.setDebug(true);
		
		//Step 2 : compose the message [text,multi media]
		MimeMessage m = new MimeMessage(session);
		
		try {
		
		//from email
		m.setFrom(from);
		
		//adding recipient to message
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		
		//adding subject to message
		m.setSubject(subject);
	
		
		//attachement..
		
		//file path
		String path="C:\\Users\\user\\Desktop\\ca_logo.png";
		
		
		MimeMultipart mimeMultipart = new MimeMultipart();
		//text
		//file
		
		MimeBodyPart textMime = new MimeBodyPart();
		
		MimeBodyPart fileMime = new MimeBodyPart();
		
		try {
			
			textMime.setText(message);
			
			File file=new File(path);
			fileMime.attachFile(file);
			
			
			mimeMultipart.addBodyPart(textMime);
			mimeMultipart.addBodyPart(fileMime);
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		m.setContent(mimeMultipart);
		
		
		//send 
		
		//Step 3 : send the message using Transport class
		Transport.send(m);
		
		
		
		}catch (Exception e) 
                {
                    System.out.println("Exception  :"+e);
			e.printStackTrace();
		}

	
		System.out.println("Sent success...................");
		
		
	}

	//this is responsible to send email..
// This is responsible for sending email
private static void sendEmail(String message, String subject, String to, String from) {

    // Variable for Gmail
    String host = "smtp.gmail.com";

    // Get the system properties
    Properties properties = new Properties();
    System.out.println("PROPERTIES: " + properties);

    // Set important information to properties object

    // Host setup
    properties.put("mail.smtp.host", host);
    properties.put("mail.smtp.port", "465");
    properties.put("mail.smtp.ssl.enable", "true");
    properties.put("mail.smtp.auth", "true");

    // Trust the Gmail SMTP server to avoid SSL handshake issues
    properties.put("mail.smtp.ssl.trust", host);

    // Step 1: Get the session object
    Session session = Session.getInstance(properties, new Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("tejaskasture01@gmail.com", "Tejas32232@");
        }
    });

    // Enable debugging for the session
    session.setDebug(true);

    try {
        // Step 2: Compose the message (text, multimedia)
        MimeMessage mimeMessage = new MimeMessage(session);

        // Set the 'from' email address
        mimeMessage.setFrom(new InternetAddress(from));

        // Set the recipient's email address
        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

        // Set the subject of the email
        mimeMessage.setSubject(subject);

        // Set the body of the email
        mimeMessage.setText(message);

        // Step 3: Send the message using the Transport class
        Transport.send(mimeMessage);

        System.out.println("Email sent successfully!");

    } catch (MessagingException e) {
        e.printStackTrace();
        System.out.println("Error while sending email: " + e.getMessage());
    }
}

}
