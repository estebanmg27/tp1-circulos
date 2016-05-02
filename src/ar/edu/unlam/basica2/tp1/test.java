package ar.edu.unlam.basica2.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {
private double precision = 0.01;

	@Test
	public void queCreeUnCírculoConRadio2() {
		Círculo círculo = new Círculo(2);
		 assertEquals(2, círculo.obtenerRadio(), precision);
	}

	@Test
	public void queCreeUnCírculoConRadio3Punto7() {
		Círculo círculo = new Círculo(3.7);
		assertEquals(3.7, círculo.obtenerRadio(), precision);
	}
	
	@Test
	public void queCreeUnCírculoConRadio5() {
		Círculo círculo = new Círculo(5);
		assertEquals(5, círculo.obtenerRadio(), precision);
	}
	
	@Test
	public void queCreeUnCírculoConRadio10Punto9() {
		Círculo círculo = new Círculo(10.9);
		assertEquals(10.9, círculo.obtenerRadio(), precision);
	}
	
	@Test
	public void queElPerimetroDeUnCírculoConRadio9Punto8Sea61Punto57() {
		Círculo círculo = new Círculo(9.8);
		círculo.obtenerPerimetro();		
		assertEquals(61.57, círculo.obtenerPerimetro(), precision);
	}
	
	@Test
	public void queElPerimetroDeUnCírculoConRadio16Punto6Sea104Punto30() {
		Círculo círculo = new Círculo(16.6);
		círculo.obtenerPerimetro();		
		assertEquals(104.30, círculo.obtenerPerimetro(), precision);
	}
	
	@Test
	public void queElAreaDeUnCírculoConRadio9Punto8Sea301Punto71() {
		Círculo círculo = new Círculo(9.8);		
		círculo.obtenerArea();		
		assertEquals(301.71, círculo.obtenerArea(), precision);
	}
	
	@Test
	public void queElAreaDeUnCírculoConRadio16Punto6Sea865Punto69() {
		Círculo círculo = new Círculo(16.6);
		círculo.obtenerArea();		
		assertEquals(865.69, círculo.obtenerArea(), precision);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente mÃ©todo se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
}

	
