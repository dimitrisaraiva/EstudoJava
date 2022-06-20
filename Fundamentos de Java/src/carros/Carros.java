/**
 * Fundamentos carros
 */
package carros;

import java.util.Random;

/**
 * @author Dimitri Classe modelo
 */
public class Carros {

	/**
	 * 
	 */
	public Carros() {
		super();
		System.out.println("-----------------------------");
		Random chassi = new Random();
		String chassiCarro = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXWZ");
		System.out.print("Chassi: * ");
		for (int i = 0; i < 16; i++) {

			char numeracao = (char) chassi.nextInt(chassiCarro.length());
			System.out.print(chassiCarro.charAt(numeracao));
		}
		System.out.println(" * ");

	}

	int ano;
	String cor;
	String modelo;

	void ligar() {
		System.out.println("Carro Ligado");
	}

	void desligar() {
		System.out.println("Carro Desligado");
	}

	void acelerar() {
		System.out.println("Acelerar Carro");
	}
}
