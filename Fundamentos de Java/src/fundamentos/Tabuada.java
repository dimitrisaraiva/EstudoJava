/**
 * Fundamentos do Java
 * La�os de repeti��es
 */
package fundamentos;

import java.util.Scanner;

/**
 * @author dimitri.vsazevedo
 *
 */
public class Tabuada {

	/**
	 * Construtor
	 */
	
	public Tabuada() {
		
	}
	
	/**
	 * M�todo Principal 
	 * @param args
	 */
	
	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("---------TABUADA---------");
		System.out.println("Digite o valor da tabuada");
		System.out.println("");
		valor = teclado.nextInt();
		System.out.println("Tabuada do " + valor);
		System.out.println("");
		//processamento/saida
		for (int i = 1; i < 11; i++) {
		System.out.println(valor + " x " + i + " = " + (valor * i));
		}
		
		teclado.close();

	}

}
