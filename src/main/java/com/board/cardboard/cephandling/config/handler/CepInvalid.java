package com.board.cardboard.cephandling.config.handler;

public class CepInvalid extends Exception{

    public CepInvalid(){
        super("CEP invalido. Verifica a formatação.");
    }
    public CepInvalid(String msg){
        super(msg);
    }
}
