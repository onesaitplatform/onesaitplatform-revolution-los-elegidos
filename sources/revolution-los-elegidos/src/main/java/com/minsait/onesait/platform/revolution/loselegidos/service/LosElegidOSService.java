package com.minsait.onesait.platform.revolution.loselegidos.service;

import com.minsait.onesait.platform.revolution.loselegidos.dto.LosElegidOSResponseDto;

public interface LosElegidOSService {

    LosElegidOSResponseDto generateResponse(String text, int bound);
}
