/**
 * 
 */
package carros;


/**
 * @author dimitri.vsazevedo
 *
 */
public class Hangar {

		
	/**
	 * Metodo princial
	 * @param args
	 */
	public static void main(String[] args) {
		Aviao boing = new Aviao();
		boing.modelo = "Boing 777";
		boing.ano = 2009;
		boing.cor = "Azul";
		boing.envergadura = 60.9;
		System.out.println("Nome do Avi�o: " + boing.modelo);
		System.out.println("Ano do Avi�o: " + boing.ano);
		System.out.println("Cor do Avi�o: " + boing.cor);
		System.out.println("Envergadura do Avi�o: " + boing.envergadura);
		
		boing.aterrizar();
		boing.acelerar();
		
		

	}

}
