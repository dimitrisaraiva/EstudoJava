/**
 * Fundamentos do Java
 * Variaveis operadores de estruturas de controle
 * Exercicios 1 - APP Eleitor
 * Desenvolver um APP no modo console que em função da idade do
 * eleitor avise se o voto é obrigatorio ou não
 * Abaixo de 16 anos VOTO PROIBIDO
 * Entre 18 e 70 VOTO OBRIGATORIO
 * 16, 17 ou acima de 70 VOTO FACULTATIVO	
 */
package fundamentos;

import java.util.Scanner;

/**
 * @author dimitri.vsazevedo
 *
 */
public class Eleitor {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// variaveis
		int idade;
		// objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("APP ELEITOR ===================");
		System.out.println("Digite sua idade:");
		// entrada
		idade = teclado.nextInt();
		// apoio ao teste do fluxo (verificar se a idade foi capturada)
		// System.out.println(idade)
		if (idade < 16) {
			System.out.println("PROIBIR VOTAR");
		} else if (idade >= 18 && idade < 70) {
			System.out.println("OBRIGATORIO VOTAR");
		} else {
			System.out.println("VOTO FACULTATIVO");
		}
		teclado.close();

		System.out.println(idade);

	}

}
