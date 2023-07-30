package gestorApp;

import javax.swing.JOptionPane;

public class Convertidordetemperatura {

	public void Temperatura(double valor) {
		String[] lista = { "De Celsius a Kelvin", "De Celsius a Fahrenheit", "De Kelvin a Celsius",
				"De Kelvin a Fahrenheit", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin" };
		Object Conversiontemperatura = JOptionPane.showInputDialog(null,
				"Elige a la escala que desea covertir tu temperatura", "Grados", JOptionPane.PLAIN_MESSAGE, null, lista,
				lista[0]);
		switch ((String) Conversiontemperatura) {
		case "De Celsius a Kelvin":
			CelsiusAK(valor);
			break;
		case "De Celsius a Fahrenheit":
			CelsiusAF(valor);
			break;
		case "De Kelvin a Celsius":
			KelvinAC(valor);
			break;
		case "De Kelvin a Fahrenheit":
			KelvinAF(valor);
			break;
		case "De Fahrenheit a Celsius":
			FahrenheitAC(valor);
			break;
		case "De Fahrenheit a Kelvin":
			FahrenheitAK(valor);
			break;
		default:
			break;
		}
	}

	private void CelsiusAF(double valor) {
		double Fahrenheit = ((valor*(0.55555))+32);
		JOptionPane.showMessageDialog(null, valor + "°C son " + Math.round(Fahrenheit * 100) / 100d + "°F");
	}

	private void CelsiusAK(double valor) {
		double Kelvin = (valor+273.15);
		JOptionPane.showMessageDialog(null, valor + "°C son " + Math.round(Kelvin * 100) / 100d + "°K");
	}

	private void FahrenheitAC(double valor) {
		double Celsius = ((0.55555)*(valor-32));
		JOptionPane.showMessageDialog(null, valor + "°F son " + Math.round(Celsius * 100) / 100d + "°C");
	}

	private void FahrenheitAK(double valor) {
		double Kelvin = ((0.55555)*(valor-32))+273.15;
		JOptionPane.showMessageDialog(null, valor + "°F son " + Math.round(Kelvin * 100) / 100d + "°K");
	}

	private void KelvinAC(double valor) {
		double Celsius = (valor-273.15);
		JOptionPane.showMessageDialog(null, valor + "°K			 son " + Math.round(Celsius * 100) / 100d + "°C");
	}

	private void KelvinAF(double valor) {
		double Fahrenheit = (valor-273.15)*(0.55555)+32;
		JOptionPane.showMessageDialog(null, valor + "°K son " + Math.round(Fahrenheit * 100) / 100d + "°F");
	}
}
