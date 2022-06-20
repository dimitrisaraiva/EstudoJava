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
		System.out.println("Nome do veículo: " + ferrari.modelo);
		System.out.println("Ano do veículo: " + ferrari.ano);
		System.out.println("Cor do veículo: " + ferrari.cor);
		ferrari.ligar();
		ferrari.desligar();
		ferrari.acelerar();
		// objeto 2
		Carros fusca = new Carros();
		fusca.modelo = "fusca";
		fusca.ano = 1987;
		fusca.cor = "Prata";
		System.out.println("Nome do veículo: " + fusca.modelo);
		System.out.println("Ano do veículo: " + fusca.ano);
		System.out.println("Cor do veículo: " + fusca.cor);
		fusca.ligar();
		fusca.desligar();
		fusca.acelerar();
		
		

		Carros up = new Carros();
		up.modelo = "UP";
		up.ano = 2022;
		up.cor = "prata";
		System.out.println("Nome do veículo: " + up.modelo);
		System.out.println("Ano do veículo: " + up.ano);
		System.out.println("Cor do veículo: " + up.cor);
		up.ligar();
		up.desligar();
		up.acelerar();

	}

}
