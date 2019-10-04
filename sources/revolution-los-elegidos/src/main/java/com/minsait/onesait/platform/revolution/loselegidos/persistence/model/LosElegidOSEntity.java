package com.minsait.onesait.platform.revolution.loselegidos.persistence.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "los_elegidos_resultados")
@Data
public class LosElegidOSEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer code;

    private String description;

    private String message;
}
