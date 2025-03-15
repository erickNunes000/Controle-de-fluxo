package com.board.cardboard.contador.handler;

public class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
