package Main;

import javax.swing.JOptionPane;
import gestorApp.*;

public class Main {
	static double pedirValor() {
		double valoreal = 0;
		boolean seguir = false;
		String valorConvertir = JOptionPane.showInputDialog("Ingrese el valor que desea convertir");
		String valorprueba = valorConvertir;
		do {
			try {
				valoreal = Float.parseFloat(valorprueba);
				seguir = true;
			} catch (NumberFormatException E) {
				seguir = false;
				JOptionPane.showMessageDialog(null, "El numero ingresado no es válido", "Numero invalido",
						JOptionPane.ERROR_MESSAGE);
			} finally {
				if (seguir == false) {
					valorprueba = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
				}
			}
		} while (seguir == false);
		return valoreal;
	}


	public static void main(String[] args) {
		Convertidordemoneda cm = new Convertidordemoneda();
		Convertidordetemperatura ct = new Convertidordetemperatura();
		
		while(true) {
			String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };
			Object opcionSeleccionada = JOptionPane.showInputDialog(null,
					"Bienvenido al Conversor Alura\n\nPor favor seleccione una opcion:\n", "Menú",
					JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
			double valor = pedirValor();

			switch ((String) opcionSeleccionada) {

			case "Conversor de Moneda":

				cm.RealizarConversion(valor);
				int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
	            if (JOptionPane.OK_OPTION == respuesta){
	            	System.out.println("Selecciona opción Afirmativa");
	            }else{
	               	JOptionPane.showMessageDialog(null, "Programa terminado");
	               	System.exit(0);
	            }
				break;

			case "Conversor de Temperatura":

				ct.Temperatura(valor);
	            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	            if((respuesta == 0)) { 
	            } else {
	                JOptionPane.showMessageDialog(null, "Programa terminado");
	                System.exit(0);
	            }



			}
		}
		

	}
}
