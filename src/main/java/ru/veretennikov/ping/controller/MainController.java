package ru.veretennikov.ping.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.veretennikov.ping.dto.AbonentStatus;
import ru.veretennikov.ping.dto.Notification;

import static ru.veretennikov.ping.dto.PingStatus.IN_NETWORK;
import static ru.veretennikov.ping.dto.PingStatus.UNAVAILABLE_SUBSCRIBER;

@Slf4j
@RestController
public class MainController {

    @PostMapping("/ping")
    public AbonentStatus ping(@RequestParam String msisdn){

        log.debug("Проверка доступности абонента {}", msisdn);

        AbonentStatus result = new AbonentStatus();
        result.setStatus(msisdn.contains("777") ? UNAVAILABLE_SUBSCRIBER : IN_NETWORK);
        return result;

    }

    @PostMapping("/send-sms")
    public String ping(@RequestBody Notification notification){
        log.debug("Входящее сообщение:\n {}", notification);
        return "ok";
    }

}
