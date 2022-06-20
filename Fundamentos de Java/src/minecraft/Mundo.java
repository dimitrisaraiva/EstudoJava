/**
 * Jogo Minecraft (Exemplo POO)
 */
package minecraft;

/**
 * @author dimitri.vsazevedo
 *cLASSE Responsavel pela cria��o dos objetos
 */
public class Mundo {

	/**
	 * Mundo principal
	 * @param args
	 */
	public static void main(String[] args) {
		// objeto 1
		Bloco blocoTerra = new Bloco();
		blocoTerra.resistencia = 1;
		blocoTerra.textura = "Terra";
		System.out.println("Bloco: " + blocoTerra.textura);
		System.out.println("Resist�ncia: " + blocoTerra.resistencia);
		blocoTerra.minerar();
		blocoTerra.construir();
		// objeto 2
		Bloco blocoMadeira = new Bloco();
		blocoMadeira.resistencia = 2;
		blocoMadeira.textura = "Madeira";
				System.out.println("Bloco: " + blocoMadeira.textura);
		System.out.println("Resist�ncia: " + blocoMadeira.resistencia);
		blocoMadeira.minerar();
		blocoMadeira.craftar();
	}

	}


