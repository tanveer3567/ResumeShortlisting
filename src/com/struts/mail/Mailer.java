package com.struts.mail;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
	public static void send(String to,String subject,String msg){
	
		final String user="veertan31@gmail.com";//change accordingly
		final String pass="z@dA1994AtSrazia$08OCT#8994";
		
		//1st step) Get the session object	
		Properties props = new Properties();
		props.put("mail.smtp.user", user);
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.port", "25");
	    props.put("mail.debug", "true");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.EnableSSL.enable", "true");
	    props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	    props.setProperty("mail.smtp.socketFactory.fallbac k", "true");
	    props.setProperty("mail.smtp.port", "465");
	    props.setProperty("mail.smtp.socketFactory.port", "465");
		
		Session session = Session.getDefaultInstance(props,
		 new javax.mail.Authenticator() {
		  protected PasswordAuthentication getPasswordAuthentication() {
		   return new PasswordAuthentication(user,pass);
		   }
		});
		//2nd step)compose message
		try {
			 MimeMessage message = new MimeMessage(session);
			 message.setFrom(new InternetAddress(user));
			 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			 message.setSubject(subject);
			 message.setText(msg);
			 
			 //3rd step)send message
			 Transport.send(message);
			
			 System.out.println("Done");
		
		 } catch (MessagingException e) {
			throw new RuntimeException(e);
		 }
			
	}
}
