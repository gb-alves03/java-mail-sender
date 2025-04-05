package com.alves.mail_sender.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ContactResponseDto {

    public static final String MESSAGE = "Email sent successfully! Thank you for your contact.";
}
