package com.alves.mail_sender.service;

import com.alves.mail_sender.dto.ContactRequestDto;

public interface EmailService {
    void sendEmail(String from, String name, String message);
}
