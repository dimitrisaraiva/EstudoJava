/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author dimitri.vsazevedo Classe Módelo
 */
public class Bloco {
	int resistencia;
	String textura;

//Métodos
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
