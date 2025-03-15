package com.board.cardboard;

import com.board.cardboard.cephandling.config.formatter.CepFormatter;
import com.board.cardboard.cephandling.config.handler.CepInvalid;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardboardApplication {

	public static void main(String[] args) {

		try {
			String res = new CepFormatter().cepFormat("adcd");
			System.out.println(res);
		} catch (CepInvalid e) {
			System.out.println(e.getMessage());;
		}

	}

}
