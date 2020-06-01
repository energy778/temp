package ru.veretennikov.ping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    private String msisdnA;
    private String msisdnB;
    private String text;
}
