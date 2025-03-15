package com.board.cardboard.cephandling.config.formatter;

import com.board.cardboard.cephandling.config.handler.CepInvalid;

public final class CepFormatter {
    public static String cepFormat (String cep) throws CepInvalid {
        if(cep.length()!=8){
            throw new CepInvalid("erro ao verficicar cep");
        }else{
            return cep;
        }
    }
}
