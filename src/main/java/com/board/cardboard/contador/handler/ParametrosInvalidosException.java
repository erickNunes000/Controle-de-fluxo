package com.board.cardboard.contador.handler;

public class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException(){//mensagem de erro padrão
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

    public ParametrosInvalidosException(String message){//criando personalização de messagem de erro
        super(message);
    }
}
