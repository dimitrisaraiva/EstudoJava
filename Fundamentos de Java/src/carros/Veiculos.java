/**
 * Carros Exemplos
 */
package carros;



/**
 * @author Dimitri
 *
 */
public class Veiculos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// objeto 1
		Carros ferrari = new Carros();
		ferrari.modelo = "ferrari";
		ferrari.ano = 2022;
		ferrari.cor = "Vermelha";
		System.out.println("Nome do ve�culo: " + ferrari.modelo);
		System.out.println("Ano do ve�culo: " + ferrari.ano);
		System.out.println("Cor do ve�culo: " + ferrari.cor);
		ferrari.ligar();
		ferrari.desligar();
		ferrari.acelerar();
		// objeto 2
		Carros fusca = new Carros();
		fusca.modelo = "fusca";
		fusca.ano = 1987;
		fusca.cor = "Prata";
		System.out.println("Nome do ve�culo: " + fusca.modelo);
		System.out.println("Ano do ve�culo: " + fusca.ano);
		System.out.println("Cor do ve�culo: " + fusca.cor);
		fusca.ligar();
		fusca.desligar();
		fusca.acelerar();
		
		

		Carros up = new Carros();
		up.modelo = "UP";
		up.ano = 2022;
		up.cor = "prata";
		System.out.println("Nome do ve�culo: " + up.modelo);
		System.out.println("Ano do ve�culo: " + up.ano);
		System.out.println("Cor do ve�culo: " + up.cor);
		up.ligar();
		up.desligar();
		up.acelerar();

	}

}
