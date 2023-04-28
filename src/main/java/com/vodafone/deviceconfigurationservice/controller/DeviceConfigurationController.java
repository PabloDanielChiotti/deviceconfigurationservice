package com.vodafone.deviceconfigurationservice.controller;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/device-configuration-service")
public class DeviceConfigurationController {

    private static final Integer MIN_TEMPERATURE = 0;
    private static final Integer MAX_TEMPERATURE = 10;

    @GetMapping("/configure")
    public ResponseEntity<Integer> configure() {
        return new ResponseEntity<>(RandomUtils.nextInt(MIN_TEMPERATURE, MAX_TEMPERATURE), HttpStatus.OK);
    }

}
