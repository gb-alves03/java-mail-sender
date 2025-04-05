package com.alves.mail_sender.controller;

import com.alves.mail_sender.dto.ContactRequestDto;
import com.alves.mail_sender.dto.ContactResponseDto;
//import com.alves.mail_sender.mapper.ContactMapper;
import com.alves.mail_sender.service.impl.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/contact")
@CrossOrigin(origins = "*")
public class ContactController {
    private final EmailServiceImpl emailService;
    //private final ContactMapper contactMapper = ContactMapper.INSTANCE;

    public ContactController(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> sendContact(@RequestBody ContactRequest contactRequest) {
        emailService.sendEmail(contactRequest.getFrom(), contactRequest.getName(), contactRequest.getMessage());
        return ResponseEntity.ok(ContactResponseDto.MESSAGE);
    }
}

class ContactRequest {
    private String from;
    private String name;
    private String message;

    public ContactRequest(String from, String name, String message) {
        this.from = from;
        this.name = name;
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}