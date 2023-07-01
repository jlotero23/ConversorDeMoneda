package gestorApp;

import javax.swing.JOptionPane;

public class Main {
	
	static String pedirValor() {
		String valorConvertir = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
		return valorConvertir;
	}
	
	public static void main(String[] args) {
		String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura"};
		Object opcionSeleccionada = JOptionPane.showInputDialog(null,
		             "Bienvenido al Conversor Alura\n\nPor favor seleccione una opcion:\n", "Menú",
		             JOptionPane.PLAIN_MESSAGE, null,
		             opciones, opciones[0]);
		if (opcionSeleccionada==opciones[0]) {
			String valor=pedirValor();
		} 
	}
}
