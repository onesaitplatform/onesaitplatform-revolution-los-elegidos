package com.minsait.onesait.platform.revolution.loselegidos.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LosElegidOSResponseDto implements Serializable {

    private String code;
    private String description;
    private String message;
}
