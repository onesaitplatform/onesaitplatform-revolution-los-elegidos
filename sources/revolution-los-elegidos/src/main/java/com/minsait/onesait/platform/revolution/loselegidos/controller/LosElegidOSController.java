package com.minsait.onesait.platform.revolution.loselegidos.controller;

import com.minsait.onesait.platform.revolution.loselegidos.dto.LosElegidOSResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/loselegidos")
@Slf4j
public class LosElegidOSController {

    private Random random = new Random(System.currentTimeMillis());

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LosElegidOSResponseDto> get(@RequestParam("param") String param,
            @RequestParam(value = "bound", defaultValue = "100") int bound) {
        LosElegidOSResponseDto retVal = new LosElegidOSResponseDto();
        retVal.setCode("OK");
        retVal.setDescription("No error");

        int randomInt = random.nextInt(bound);

        try {
            String message = "Message " + param + " " + randomInt;
            retVal.setMessage(message);
            Thread.sleep(randomInt * 100);
        } catch (InterruptedException e) {
            log.error("Excepción: {}", e.getMessage(), e);
            retVal.setMessage(e.getMessage());
        }
        log.info("Mensaje = {}", retVal.getMessage());
        return ResponseEntity.ok(retVal);
    }

}
