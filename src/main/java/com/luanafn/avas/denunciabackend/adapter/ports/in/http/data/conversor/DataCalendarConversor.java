package com.luanafn.avas.denunciabackend.adapter.ports.in.http.data.conversor;

import com.luanafn.avas.denunciabackend.adapter.ports.in.http.data.entity.Data;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Objects;

@Component
public class DataCalendarConversor {
    public Calendar convert(Data data) {
        Calendar calendar = Calendar.getInstance();

        if (!Objects.isNull(data.getAno()))
            calendar.set(Calendar.YEAR, data.getAno());
        if (!Objects.isNull(data.getDia()))
            calendar.set(Calendar.DAY_OF_MONTH, data.getDia());
        if (!Objects.isNull(data.getHora()))
            calendar.set(Calendar.HOUR_OF_DAY, data.getHora());
        if (!Objects.isNull(data.getMes()))
            calendar.set(Calendar.MONTH, data.getMes());
        if (!Objects.isNull(data.getMinuto()))
            calendar.set(Calendar.MINUTE, data.getMinuto());

        return calendar;
    }

    public Data convert(Calendar calendar) {
        Data data = new Data();
        data.setAno(calendar.get(Calendar.YEAR));
        data.setDia(calendar.get(Calendar.DAY_OF_MONTH));
        data.setHora(calendar.get(Calendar.HOUR));
        data.setMes(calendar.get(Calendar.MONTH));
        data.setMinuto(calendar.get(Calendar.MINUTE));

        return data;
    }
}
