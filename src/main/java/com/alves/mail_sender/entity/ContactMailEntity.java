package com.alves.mail_sender.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ContactMailEntity {
    private Long id;
    private String from;
    private String name;
    private String message;
}
