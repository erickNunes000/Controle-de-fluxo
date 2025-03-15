package com.board.cardboard.contador;

import com.board.cardboard.contador.handler.ParametrosInvalidosException;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro");
        int paramUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int paramDois = terminal.nextInt();
        terminal.close();
        try{
            contar(paramUm, paramDois);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException{
        if(paramUm > paramDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = paramDois-paramUm;
        for(int i=0;i<contagem;i++){
            System.out.println("Imprimindo o número "+(i+1));
        }
    }
}
