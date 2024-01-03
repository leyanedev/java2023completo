package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
//(ºF - 32) X 5/9 = ºC
	final double FATOR = 5.0 / 9.0;
	final double AJUSTE = 32;
	
	double fahrenheit = 86;
	double celsius = (fahrenheit - AJUSTE)* FATOR;
	System.out.println("O resultado é "+celsius +"ºC" );
	
	fahrenheit = 150;
	celsius = (fahrenheit - AJUSTE)* FATOR;		
		
	System.out.println("O resultado é "+celsius +"ºC" );
		
	//	resolucao_pessoal();
		
	}

	private static void resolucao_pessoal() {
		double tempF = 100.75;
		double tempC;
		final int const1 = 32;
		final double const2 = 5.0/9;
		
		System.out.println("Promagrama para conversão de Fahrenheit para Celsius");
		System.out.println("Temperatura em Fahrenheit para conversão é de: " + tempF + "ºF");
		tempC = (tempF - const1) * const2;
		System.out.println("Temperatura em Celsius é de " + tempC + "ºC");
	}
}
