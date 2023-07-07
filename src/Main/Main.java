package Main;


import javax.swing.JOptionPane;

public class Main {
	
	static String pedirValor() {
		String valorConvertir = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
		return valorConvertir;
	}
	
	static void ConvertirMoneda() {
		boolean seguir=false;
		float valoreal =0;
		int conversion=0;
		String valor=pedirValor();
		do {
			try {
				valoreal=Float.parseFloat(valor);
				seguir=true;
			}catch(NumberFormatException E) {
				seguir=false;
				JOptionPane.showMessageDialog(null,"El numero ingresado no es válido", "Numero invalido", JOptionPane.ERROR_MESSAGE);
			}finally {
				if (seguir==false) {
					valor=pedirValor();
				}
			}	
		}while(seguir==false);
		String[] opcionesDeConversion = { "De Peso colombiano a Dólar", "De Peso Colombiano a Euro", "De Peso Colombiano a Yen Japonés", "De Peso Colombiano a Libra Esterlina", "De Peso Colombiano a Won surcoreano",
				                          "De Dólar a Peso Colombiano", "De Euro a Peso Colombiano", "De Yen Japonés a Peso Colombiano", "De Libra Esterlina a Peso Colombiano", "De Won surcoreano a Peso Colombiano"};
		Float[] valores= {(float) (1.0*1.0),(float) (1.0*2.0)};
		Object ConversionSeleccionada = JOptionPane.showInputDialog(null,
				"Elige la moneda a la que deseas convertir tu dinero", "Monedas",
	             JOptionPane.PLAIN_MESSAGE, null,
	             opcionesDeConversion, opcionesDeConversion[0]);
		for (int i = 0; i < opcionesDeConversion.length; i++) {
			if (opcionesDeConversion[i].equals(ConversionSeleccionada)){
				conversion=i;
			}
		}
		System.out.println(valores[conversion]);
	}
	
	public static void main(String[] args) {
		String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura"};
		Object opcionSeleccionada = JOptionPane.showInputDialog(null,
		             "Bienvenido al Conversor Alura\n\nPor favor seleccione una opcion:\n", "Menú",
		             JOptionPane.PLAIN_MESSAGE, null,
		             opciones, opciones[0]);
		
		if (opcionSeleccionada==opciones[0]) {
			ConvertirMoneda();
			
			
	
		} 
	}
}
