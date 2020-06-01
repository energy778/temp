package ru.veretennikov.ping.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.veretennikov.ping.dto.AbonentStatus;

import static ru.veretennikov.ping.dto.PingStatus.IN_NETWORK;
import static ru.veretennikov.ping.dto.PingStatus.UNAVAILABLE_SUBSCRIBER;

@RestController
public class MainController {

    @PostMapping("/ping")
    public AbonentStatus ping(@RequestParam String msisdn){
        AbonentStatus result = new AbonentStatus();
        result.setStatus(msisdn.contains("777") ? UNAVAILABLE_SUBSCRIBER : IN_NETWORK);
        return result;
    }

}
