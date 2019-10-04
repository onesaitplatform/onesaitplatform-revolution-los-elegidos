package com.minsait.onesait.platform.revolution.loselegidos.service.impl;

import com.minsait.onesait.platform.revolution.loselegidos.dto.LosElegidOSResponseDto;
import com.minsait.onesait.platform.revolution.loselegidos.mapper.LosElegidOSMapper;
import com.minsait.onesait.platform.revolution.loselegidos.persistence.model.LosElegidOSEntity;
import com.minsait.onesait.platform.revolution.loselegidos.persistence.repository.LosElegidOSJpaEntityRepository;
import com.minsait.onesait.platform.revolution.loselegidos.service.LosElegidOSService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@Slf4j
public class LosElegidOSServiceImpl implements LosElegidOSService {

    private Random random = new Random(System.currentTimeMillis());

    private final LosElegidOSJpaEntityRepository repository;

    public LosElegidOSServiceImpl(LosElegidOSJpaEntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public LosElegidOSResponseDto generateResponse(String text, int bound) {
        LosElegidOSResponseDto retVal;
        int randomInt = random.nextInt(bound);

        Optional<LosElegidOSEntity> optionalEntity = repository.findById(randomInt);

        if (optionalEntity.isPresent()) {
            retVal = LosElegidOSMapper.asDto(optionalEntity.get());
        } else {

            HttpStatus httpStatus;
            switch (randomInt % 6) {
                case 4:
                    httpStatus = HttpStatus.NOT_FOUND;
                    break;
                case 5:
                    httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
                    break;
                default:
                    httpStatus = HttpStatus.OK;
                    break;
            }

            retVal = new LosElegidOSResponseDto();
            retVal.setCode(httpStatus.value());
            retVal.setDescription(httpStatus.getReasonPhrase());
            String message = "Message " + text + ". Waiting " + randomInt + "00 ms";
            retVal.setMessage(message);

            repository.save(LosElegidOSMapper.asEntity(retVal));
        }

        try {
            long counter = 0;
            for (long i = 0; i < randomInt * 1000; i++) {
                for (long j = 0; j < randomInt * 100; j++) {
                    counter += i * j;
                }
            }
            Thread.sleep(randomInt * 10);
        } catch (InterruptedException e) {
            log.error("Excepción: {}", e.getMessage(), e);
            retVal.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            retVal.setDescription(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
            retVal.setMessage(e.getMessage());
        }
        log.info("Message = {}", retVal.getMessage());
        return retVal;
    }
}
