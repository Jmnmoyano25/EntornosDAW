package pruebas;

public class DniEspañol {
		
	//secuenciaLetrasNIF.charAt(4) // Obtiene la letra
	
	
	//ATRIBUTOS
	private int numDNI;
	public String numeroNIF;
	private static final String secuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE"; 
	//CONSTRUCTOR
	
	
	
		//METODOS
//	 proporcionará el número de DNI (sólo las cifras numéricas)
	 
	public int obtenerDNI () {
		return this.numDNI;
	}
	

	
	public void establecer(int dni) {		// método establecer (set), que permitirán modificar el DNI
		this.numDNI = dni;
	}
	
		//métodos internos privados para calcular la letra de un número de DNI
	
	 private static char calcularLetraNIF (int dni) {
		 char letra;
		 letra = secuenciaLetrasNIF.charAt(dni % 23);
		 return letra;
	 }
	 
	 public String obtenerNIF () {
		 char letra = calcularLetraNIF(numDNI);
		 return Integer.toString(numDNI)+letra;
		}

	 
	 private static char extraerLetraNIF (String nif) {
		 int letra =  nif.length();
		 return nif.charAt(letra -1);
	 }
	 
	 
	 private static int extraerNumeroNIF (String nif) {
		 int numero = Integer.parseInt(nif.substring(0, nif.length()-1));
		 return numero;
	 }
	 
	 
	 private boolean validarNIF (String nif) {
		 boolean valido = true;
		 char letra_calculada;
		 char letra_leida;
		 int dni_leido;
		 
		 if(nif.equals(null)) {  //El parametro debe ser un objeto no vacio
			 valido = false; 
		 } else if (nif.length() < 8 || nif.length() > 9) {    // La cadena debe estar entre 8(7+1) y 9(8+1) caracteres
			 valido = false;
		 } else {
			 letra_leida = DniEspañol.extraerLetraNIF(nif); 	// Extraemos la letra de NIF (letra)
			 dni_leido = DniEspañol.extraerNumeroNIF(nif);         // Extraemos el numero de DNI (int)
			 letra_calculada = DniEspañol.calcularLetraNIF(dni_leido);   // Calculamos la letra de NIF
			 
			 if(letra_leida == letra_calculada) {   // Comparamos la letra extraida con la calculada
				 valido = true;
			 }else { 
			 	valido = false; 
		 }
		 
	 }	
		 return valido;
	 }





	public static void main(String[] args) {
		
		DniEspañol dni1 = new DniEspañol();
		
		dni1.calcularLetraNIF(9054412);
		dni1.extraerLetraNIF("09054412W");
		dni1.extraerNumeroNIF("09054412W");
		dni1.validarNIF("09054412W");
		
		
		System.out.println("Calcula la letra del DNI: " + dni1.calcularLetraNIF(9054412));
		System.out.println("Extrae la letra NIF: " + dni1.extraerLetraNIF("09054412W"));
		System.out.println("Extrae el numero NIF: " + dni1.extraerNumeroNIF("09054412W"));
		System.out.println("Valida el numero NIF: " + dni1.validarNIF("09054412W"));

	}


}