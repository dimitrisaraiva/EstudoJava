
/**
 *Fundamentos do JAVA
 *Gerador de Numeros e caracteres aleatorios 
 */
package fundamentos;

import java.util.Random;

/**
 * @author dimitri.vsazevedo
 *
 */
public class NumerosAleatorios {

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Random gerador = new Random();

		int dado = gerador.nextInt(6) + 1;
		System.out.println("Face do dado: " + dado);

		// exemplo 3
		String chassi = new String("ABCDEFGHIJKLMNOPQRSTUVWXWZ");
		System.out.println("Chassi: * ");
		for (int i = 0; i < 2; i++) {
			
		char numeracao = (char) gerador.nextInt(chassi.length());
		System.out.println(chassi.charAt(numeracao));
		}
		System.out.println(" * ");
		
	}

}
