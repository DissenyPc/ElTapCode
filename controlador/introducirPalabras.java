package controlador;

import javax.swing.JOptionPane;

public class introducirPalabras {

	public static String[] introducir(String[] palabras) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < palabras.length; i++) {
			
			palabras[i] = JOptionPane.showInputDialog("Introduce la palabra nº " + (i+1));
			//System.out.println(i);
			//System.out.println(palabras[i]);
			//System.out.println(palabras.length);
			
		}
		
		return palabras;
		
	}

}
