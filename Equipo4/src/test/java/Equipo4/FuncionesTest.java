package Equipo4;

import static org.junit.Assert.*;

import org.junit.Test;

public class FuncionesTest {

	private Funciones funciones = new Funciones();
	private int resultadoEsperado, resultado;

	@Test
	public void testCuadrado() {
		resultado = funciones.cuadrado(3);
		resultadoEsperado = 9;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void test() {
		
	}


}
