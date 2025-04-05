package com.alves.mail_sender.service.impl;

import com.alves.mail_sender.dto.ContactRequestDto;
import com.alves.mail_sender.service.EmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String to;

    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }


    @Override
    public void sendEmail(String from, String name, String message) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setSubject("New contact from " + name);
        simpleMailMessage.setText(message);
        simpleMailMessage.setTo(to);

        mailSender.send(simpleMailMessage);
    }
}
