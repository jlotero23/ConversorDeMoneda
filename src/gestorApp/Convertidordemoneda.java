package gestorApp;

import javax.swing.JOptionPane;

public class Convertidordemoneda {

	public void RealizarConversion(double valor) {
		String[] opcionesDeConversion = { "De Peso colombiano a Dólar", "De Peso Colombiano a Euro",
				"De Peso Colombiano a Yen Japonés", "De Peso Colombiano a Libra Esterlina",
				"De Peso Colombiano a Won surcoreano", "De Dólar a Peso Colombiano", "De Euro a Peso Colombiano",
				"De Yen Japonés a Peso Colombiano", "De Libra Esterlina a Peso Colombiano",
				"De Won surcoreano a Peso Colombiano" };
		Object ConversionSeleccionada = JOptionPane.showInputDialog(null,
				"Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
				opcionesDeConversion, opcionesDeConversion[0]);
		switch ((String) ConversionSeleccionada) {
		case "De Peso colombiano a Dólar":
			DepesoAdolar(valor);
			break;
		case "De Peso Colombiano a Euro":
			DepesoAeuro(valor);
			break;
		case "De Peso Colombiano a Yen Japonés":
			DepesoAyen(valor);
			break;
		case "De Peso Colombiano a Libra Esterlina":
			DepesoAlibra(valor);
			break;
		case "De Peso Colombiano a Won surcoreano":
			DepesoAWon(valor);
			break;
		case "De Dólar a Peso Colombiano":
			DedolarApeso(valor);
			break;
		case "De Euro a Peso Colombiano":
			DeeuroApeso(valor);
			break;
		case "De Yen Japonés a Peso Colombiano":
			DeyenApeso(valor);
			break;
		case "De Libra Esterlina a Peso Colombiano":
			DelibraApeso(valor);
			break;
		case "De Won surcoreano a Peso Colombiano":
			DewonApeso(valor);
			break;
		default:
			break;
		}
	}

	private void DepesoAdolar(double valor) {
		double dolar = valor*0.00026;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(dolar *  100) / 100d +" Dólares");
	}

	private void DepesoAeuro(double valor) {
		double euro = valor*0.00023;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(euro *  100) / 100d +" Euros");
	}

	private void DepesoAyen(double valor) {
		double yen = valor*0.036;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(yen *  100) / 100d +" Yen Japonés");
	}

	private void DepesoAlibra(double valor) {
		double libra = valor*0.00020;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(libra *  100) / 100d +" Libras Esterlinas");
	}

	private void DepesoAWon(double valor) {
		double won = valor*0.32;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(won *  100) / 100d +" Wones Surcoreanos");
	}

	private void DedolarApeso(double valor) {
		double peso = valor*3920.26;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(peso *  100) / 100d +" Pesos Colombianos");
	}

	private void DeeuroApeso(double valor) {
		double peso = valor*4326.59;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(peso *  100) / 100d +" Pesos Colombianos");
	}

	private void DeyenApeso(double valor) {
		double peso = valor*27.77;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(peso *  100) / 100d +" Pesos Colombianos");
	}

	private void DelibraApeso(double valor) {
		double peso = valor*5035.97;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(peso *  100) / 100d +" Pesos Colombianos");
	}

	private void DewonApeso(double valor) {
		double peso = valor*3.08;
		JOptionPane.showMessageDialog(null,"Tienes $"+Math.round(peso *  100) / 100d +" Pesos Colombianos");
	}
}
