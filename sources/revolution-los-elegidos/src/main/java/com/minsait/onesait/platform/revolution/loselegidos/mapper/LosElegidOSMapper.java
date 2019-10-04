package com.minsait.onesait.platform.revolution.loselegidos.mapper;

import com.minsait.onesait.platform.revolution.loselegidos.dto.LosElegidOSResponseDto;
import com.minsait.onesait.platform.revolution.loselegidos.persistence.model.LosElegidOSEntity;

public class LosElegidOSMapper {

    public static LosElegidOSResponseDto asDto(LosElegidOSEntity entity) {
        LosElegidOSResponseDto retVal = new LosElegidOSResponseDto();
        retVal.setCode(entity.getCode());
        retVal.setDescription(entity.getDescription());
        retVal.setMessage(entity.getMessage());
        return retVal;
    }

    public static LosElegidOSEntity asEntity(LosElegidOSResponseDto dto) {
       LosElegidOSEntity retVal = new LosElegidOSEntity();
       retVal.setCode(dto.getCode());
       retVal.setDescription(dto.getDescription());
       retVal.setMessage(dto.getMessage());
       return retVal;
    }
}
