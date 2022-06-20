/**
 * 
 */
package minecraft;

/**
 * @author dimitri.vsazevedo
 *
 */
public class Itens {

	/**
	 * Contrutor
	 */
	public Itens() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Enxada enxadaDiamante = new Enxada();
		enxadaDiamante.resistencia = 10;
		enxadaDiamante.textura = "Diamante";
		enxadaDiamante.conquista = false;
		System.out.println("Enxada de: " + enxadaDiamante.textura);
		System.out.println("Resistencia:" + enxadaDiamante.resistencia);
		enxadaDiamante.arar();
		if (enxadaDiamante.conquista == true) {
			System.out.println("=============================");
			System.out.println("Conquista Obtida!");
			System.out.println("Dedicação Sério! Hora do plantio");
			System.out.println("=============================");
		
		}
		enxadaDiamante.minerar();

	}

}
