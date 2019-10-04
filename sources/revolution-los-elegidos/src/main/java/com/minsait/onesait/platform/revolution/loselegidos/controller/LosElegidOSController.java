package com.minsait.onesait.platform.revolution.loselegidos.controller;

import com.minsait.onesait.platform.revolution.loselegidos.dto.LosElegidOSResponseDto;
import com.minsait.onesait.platform.revolution.loselegidos.service.LosElegidOSService;
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

    private final LosElegidOSService service;

    public LosElegidOSController(LosElegidOSService service) {
        this.service = service;
    }

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LosElegidOSResponseDto> get(@RequestParam("param") String param,
            @RequestParam(value = "bound", defaultValue = "100") int bound) {
        LosElegidOSResponseDto retVal = service.generateResponse(param, bound);
        return ResponseEntity.status(retVal.getCode()).body(retVal);
    }

}
