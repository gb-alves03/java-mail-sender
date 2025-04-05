package com.alves.mail_sender.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ContactRequestDto {

    private String from;
    private String name;
    private String message;
}
