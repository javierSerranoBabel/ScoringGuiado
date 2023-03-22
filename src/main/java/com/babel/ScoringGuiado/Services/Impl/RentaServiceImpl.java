package com.babel.ScoringGuiado.Services.Impl;

import com.babel.ScoringGuiado.Models.Renta;
import com.babel.ScoringGuiado.Services.RentaService;
import org.springframework.stereotype.Service;

@Service
public class RentaServiceImpl implements RentaService {
    @Override
    public Renta addRenta(Renta renta) {
        return renta;
    }
}
