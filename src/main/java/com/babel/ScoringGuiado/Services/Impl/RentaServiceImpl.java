package com.babel.ScoringGuiado.Services.Impl;

import com.babel.ScoringGuiado.Models.Renta;
import com.babel.ScoringGuiado.Persistance.Database.mappers.RentaMapper;
import com.babel.ScoringGuiado.Services.RentaService;
import org.springframework.stereotype.Service;

@Service
public class RentaServiceImpl implements RentaService {
    private RentaMapper rentaMapper;

    public RentaServiceImpl(RentaMapper rentaMapper) {
        this.rentaMapper = rentaMapper;
    }

    @Override
    public Renta addRenta(Renta renta) {
        this.validateRenta(renta);
        this.rentaMapper.insert(renta);
        return renta;
    }

    private void validateRenta(Renta renta){

    }

    private void validatePersona(Renta renta){
        
    }
}
