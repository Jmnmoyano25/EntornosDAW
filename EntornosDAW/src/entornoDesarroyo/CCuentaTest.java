package entornoDesarroyo;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CCuentaTest {

	CCuenta miCuenta = new CCuenta();

//CAJA NEGRA	

	@ParameterizedTest
	@CsvSource({"-10,1","-3,2","10,0"})
	@DisplayName("Caja Blanca - Ingresar")
	void testIngreso(double cant,int resul) {
		assertEquals(resul,miCuenta.ingresar(cant));
	}	
	
//CAJA NEGRA
	
	@ParameterizedTest
	@CsvSource({"100,100","101,100"})
	@DisplayName("Caja Negra - Retirar")
	void testRetirar(double canti, int saldo) {
		miCuenta.ingresar(canti);
		double esperado = miCuenta.dSaldo - canti;
		System.out.println("Saldo: " + miCuenta.dSaldo);
		miCuenta.retirar(canti);
		assertEquals(esperado, miCuenta.dSaldo);
	}
	
	
}
