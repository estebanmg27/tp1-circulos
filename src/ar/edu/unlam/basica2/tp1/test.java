package ar.edu.unlam.basica2.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {
private double precision = 0.01;

	@Test
	public void queCreeUnC�rculoConRadio2() {
		C�rculo c�rculo = new C�rculo(2);
		 assertEquals(2, c�rculo.obtenerRadio(), precision);
	}

	@Test
	public void queCreeUnC�rculoConRadio3Punto7() {
		C�rculo c�rculo = new C�rculo(3.7);
		assertEquals(3.7, c�rculo.obtenerRadio(), precision);
	}
	
	@Test
	public void queCreeUnC�rculoConRadio5() {
		C�rculo c�rculo = new C�rculo(5);
		assertEquals(5, c�rculo.obtenerRadio(), precision);
	}
	
	@Test
	public void queCreeUnC�rculoConRadio10Punto9() {
		C�rculo c�rculo = new C�rculo(10.9);
		assertEquals(10.9, c�rculo.obtenerRadio(), precision);
	}
	
	@Test
	public void queElPerimetroDeUnC�rculoConRadio9Punto8Sea61Punto57() {
		C�rculo c�rculo = new C�rculo(9.8);
		c�rculo.obtenerPerimetro();		
		assertEquals(61.57, c�rculo.obtenerPerimetro(), precision);
	}
	
	@Test
	public void queElPerimetroDeUnC�rculoConRadio16Punto6Sea104Punto30() {
		C�rculo c�rculo = new C�rculo(16.6);
		c�rculo.obtenerPerimetro();		
		assertEquals(104.30, c�rculo.obtenerPerimetro(), precision);
	}
	
	@Test
	public void queElAreaDeUnC�rculoConRadio9Punto8Sea301Punto71() {
		C�rculo c�rculo = new C�rculo(9.8);		
		c�rculo.obtenerArea();		
		assertEquals(301.71, c�rculo.obtenerArea(), precision);
	}
	
	@Test
	public void queElAreaDeUnC�rculoConRadio16Punto6Sea865Punto69() {
		C�rculo c�rculo = new C�rculo(16.6);
		c�rculo.obtenerArea();		
		assertEquals(865.69, c�rculo.obtenerArea(), precision);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
}

	
