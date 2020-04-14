package com.luanafn.avas.denunciabackend.adapter.ports.in.http.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class Data {
    @Max(31)
    @Min(1)
    private Integer dia;
    @Max(12)
    @Min(1)
    private Integer mes;
    @Max(2100)
    @Min(1900)
    private Integer ano;
    @Max(23)
    @Min(0)
    private Integer hora;
    @Max(59)
    @Min(0)
    private Integer minuto;
}
