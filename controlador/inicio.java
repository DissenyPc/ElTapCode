package controlador;

import javax.swing.JOptionPane;

public class inicio {

	public static void main(String[] args) {
		
		int numPalabras = -1;
		int intentos = 0;
		String[] Palabras;
		
		while (numPalabras == -1  && intentos < 3) {
			
			intentos++;
			
			numPalabras = adNumPal.metodo(numPalabras);
		
		}
		
		if (intentos == 3) {
			JOptionPane.showMessageDialog(null, "Dejalo, parece que no sabes lo que es un numero positovo entero",
	                "ERROR", JOptionPane.INFORMATION_MESSAGE);
		} else { 
			
			Palabras= new String[numPalabras];
			
			Palabras = introducirPalabras.introducir(Palabras);
			
			String[] codigo = tapCode.calcular(Palabras);
			
			String TextoFinal ="";
			
			for (int i = 0; i< codigo.length; i++) {
				
				TextoFinal=TextoFinal+codigo[i] + "\n";
			
			}
			
			JOptionPane.showMessageDialog(null, TextoFinal, "Solucion", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
		
		
		
		
	
	}

}
