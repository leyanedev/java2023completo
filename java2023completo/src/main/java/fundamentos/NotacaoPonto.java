package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui") //Bom dia Gui
				.toUpperCase() // BOM DIA GUI
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitovos não tem o operador "."
		int b = 3;
		System.out.println(a);
		
	}
}
