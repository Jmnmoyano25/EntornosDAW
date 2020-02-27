package rectangulo;

public class Rectan {
	
	public double x1, x2; 		//al poner public aqui ya si podemos acceder desde otro paquete	
	public double y1, y2; 		//con private se podra ver dentro de la clase
	public double base = x2 - x1;
	public double altura = y2 - y1;
	public double perimetro;
	public double superficie;
	public double desplazar;
	public static final float PI = 3.1415f;  //solo habria una copia en memoria
	
	//vamos a añadir los atributos que nos piden en el ejercicio practico
	private static int numRectangulo = 0;
	public String nombre;
	public final static String nombreFigura = "Rectangulo";
	
	//constructores
	public Rectan(String nombre){
		Rectan.numRectangulo++;
		this.nombre = nombre;
		
	}
	
	//METODOS
	public void obtenerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double Perimetro() {
		perimetro = (2 * base) + (2 * altura);
		return perimetro;
	}
	
	public double Superficie() {
		superficie = base * altura;
		return superficie;
	}
	
	public void desplazar(double X, double Y) {
		x1 += X;
		x2 += X;
		y1 += Y;
		y2 += Y;
	}
	
	public static int obtenerNumRectangulos() {
		return Rectan.numRectangulo;
	}
	
	

}
