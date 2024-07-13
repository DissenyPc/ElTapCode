package controlador;

public class tapCode {

	public static String[] calcular (String[] palabras) {
		// TODO Auto-generated method stub
		
		String[] codigo = new String[palabras.length];
		
		for (int i = 0; i < palabras.length; i++  ) {
			//System.out.println(palabras[i] + " Esto es palabras de i");
			String palabra = palabras[i].toLowerCase();
			//System.out.println(palabra + " Esto es palabra");
			codigo[i]="";
			 
			for ( int y = 0; y < palabra.length(); y++) {
				
				switch (palabra.charAt(y)) {
					case 'a' :
						codigo[i] = codigo[i] + "* * ";
						break;
					
					case 'b' :
						codigo[i] = codigo[i] + "* ** ";
						break;
						
					case 'c': case 'k' :
						codigo[i] = codigo[i] + "* *** ";
						break;	
						
					case 'd' :
						codigo[i] = codigo[i] + "* **** ";
						break;
						
					case 'e' :
						codigo[i] = codigo[i] + "* ***** ";
						break;
						
					case 'f' :
						codigo[i] = codigo[i] + "** * ";
						break;
						
					case 'g' :
						codigo[i] = codigo[i] + "** ** ";
						break;
						
					case 'h' :
						codigo[i] = codigo[i] + "** *** ";
						break;
						
					case 'i' :
						codigo[i] = codigo[i] + "** **** ";
						break;
						
					case 'j' :
						codigo[i] = codigo[i] + "** ***** ";
						break;
						
					case 'l' :
						codigo[i] = codigo[i] + "*** * ";
						break;
						
					case 'm' :
						codigo[i] = codigo[i] + "*** ** ";
						break;
						
					case 'n' : case'ñ':
						codigo[i] = codigo[i] + "*** *** ";
						break;
						
					case 'o' :
						codigo[i] = codigo[i] + "*** **** ";
						break;
						
					case 'p' :
						codigo[i] = codigo[i] + "*** ***** ";
						break;
						
					case 'q' :
						codigo[i] = codigo[i] + "**** * ";
						break;
						
					case 'r' :
						codigo[i] = codigo[i] + "**** ** ";
						break;
						
					case 's' :
						codigo[i] = codigo[i] + "**** *** ";
						break;
						
					case 't' :
						codigo[i] = codigo[i] + "**** **** ";
						break;
						
					case 'u' :
						codigo[i] = codigo[i] + "**** ***** ";
						break;
						
					case 'v' :
						codigo[i] = codigo[i] + "***** * ";
						break;
					
					case 'w' :
						codigo[i] = codigo[i] + "***** ** ";
						break;
						
					case 'x' :
						codigo[i] = codigo[i] + "***** *** ";
						break;
						
					case 'y' :
						codigo[i] = codigo[i] + "***** **** ";
						break;
						
					case 'z' :
						codigo[i] = codigo[i] + "***** ***** ";
						break;
				}
				
			}
			
		}
		
		return codigo;
	}

	
}
