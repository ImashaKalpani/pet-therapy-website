package com.shashi.utility;

import jakarta.mail.MessagingException;

public class TestMail {
	public static void main(String[] args) {
		try {
			String recipient = "zenpaws@therapydogs.com";
			String subject = "Mail Configuration Successfull";
			String htmlTextMessage = "" + "<html>"
					+ "<head><title>Java Mail Configuration Test</title><style>.greenText{color:green;} p{font-size:14;}</style></head><body>"
					+ "<h2 style='color:red;'>Welcome to ZenPaws Pet Therapy Shop</h2>" + "<p>Hey,<br>"
					+ "Thanks for singing up with ZenPaws Pet Therapy Shop<br>"
					+ "We are glad that you choose us. We invite you to check out our pets of ZenPaws Pet Therapy Shop."
					+ "<br>We’re offering up to 10% OFF on a range of wellness and relaxation gadgets to complement your pet therapy experience. Visit our site and explore our specially selected collection—perfect for enhancing your time with our furry friends! <br>"
					+ " <br>Pet therapy uses the gentle presence of animals to provide comfort, reduce stress, and promote emotional well-being. "
					+ "making us up to that level. "
					+ " As a Welcome gift for our New Customers we are providing additional 10% OFF Upto  Rs.500 for the first product purchase. To avail this offer you only have "
					+ "to enter the promo code given below.<br><br> PROMO CODE: "
					+ "<span class='greenText'>ELLISON500</span><br><br>" + "Have a good day!<br>" + "</p>" + "</body>"
					+ "</html>";
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
			System.out.println("Mail Sent Successfully!");

		} catch (MessagingException e) {
			System.out.println("Mail Sending Failed With Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
