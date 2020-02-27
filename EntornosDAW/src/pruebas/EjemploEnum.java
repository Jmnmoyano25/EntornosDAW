package pruebas;

public class EjemploEnum {
	public enum dias {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};
	
	public static void main(String[] args) {
		
		System.out.println(dias.MARTES.ordinal()); // .ordinal te dice la posicion de MARTES
		System.out.println(dias.JUEVES);
	}

}
