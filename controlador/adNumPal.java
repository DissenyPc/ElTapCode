package controlador;

import javax.swing.JOptionPane;

public  class adNumPal {
	
	

		public static int metodo(int numPalabras) {


			try {
				
				numPalabras = Integer.parseInt(JOptionPane.showInputDialog("Dime Cuantas palabras quieres introducir"));
				
				} catch (NumberFormatException  ex) {
					
					JOptionPane.showMessageDialog(null, "El Numero de palabras introducido no es un numero positivo",
			                "ERROR", JOptionPane.INFORMATION_MESSAGE);
					return numPalabras = -1;
					
				}
			return numPalabras;
			
		}

}
