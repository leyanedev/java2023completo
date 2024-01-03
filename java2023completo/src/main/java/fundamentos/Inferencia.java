package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		a = 12.57;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		var b = 4.5; // Para usar var temos que declarar e inicializar na mesma linha/comando;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
//		Comando abaixo não compila pois c já foi definida como texto
//		c = 4.5;
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // usada!
		
//		Comandos abaixo não funcionam
//		var e;
//		e = 123.45
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; // inteiro
//		f=12.01; não funciona pos a variável foi definida como inteiro nal linha anterior
				
	}
}
