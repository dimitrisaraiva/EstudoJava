/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author dimitri.vsazevedo Classe M�delo
 */
public class Bloco {
	int resistencia;
	String textura;

//M�todos
	void construir() {
		System.out.println("Recursos colocados");

	}

	void minerar() {
		System.out.println("Recursos obtidos");
	}

	void craftar() {
		System.out.println("Item Criado");
	}
}
