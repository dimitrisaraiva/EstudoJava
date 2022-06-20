/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author dimitri.vsazevedo
 * Classe Modelo com heran�a (extends)
 */
public class Enxada extends Bloco {

	/**
	 * Construtor
	 */
	public Enxada() {
		System.out.println("_____ CAMPO _____");
	}
	
	// ATRIBUTOS
	boolean conquista;
	
	//metodo
	/**
	 * Metodo usado para arar a terra
	 */
	void arar() {
		System.out.println("Terra preparada para o plantio");
		//Aten��o
		conquista = true;
		
		
	}
	//polimorfismo sobrescrita do metodo minerar
	void minerar() {
		System.out.println("Dano cauusado");
	}

}
