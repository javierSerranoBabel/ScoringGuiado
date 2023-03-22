package com.babel.ScoringGuiado.Services;

import com.babel.ScoringGuiado.Exceptions.ForeignKeyNotFoundException;
import com.babel.ScoringGuiado.Models.Renta;


public interface RentaService {
    Renta addRenta(Renta renta) throws ForeignKeyNotFoundException;
}
