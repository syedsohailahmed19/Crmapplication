package com.zomatocrm.utilities;

public interface EmailService {

	public void sendSimpleMessage(String to, String subject, String text);
	
}
