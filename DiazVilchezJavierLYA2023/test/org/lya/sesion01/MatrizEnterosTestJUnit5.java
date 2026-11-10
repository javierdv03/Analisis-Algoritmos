package org.lya.sesion01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

//import org.junit.FixMethodOrder;
//import org.junit.runners.MethodSorters;


public class MatrizEnterosTestJUnit5 {

	MatrizEnterosCuadrada objetoMatriz1;
	MatrizEnterosCuadrada objetoMatriz2;
	MatrizEnterosCuadrada objetoMatriz3;
	MatrizEnterosCuadrada objetoMatFin;
	
	
	@Before
		
	public void setUp() throws Exception {
		
		int [][] matriz1 = {{2, 4}, {3, 1}};
		int [][] matriz2 = {{35, 7, 20, 3}, {26, 17, 28, 9}, {16, 37, 33, 10}, {27, 13, 36, 48}};
		
		objetoMatriz1 = new MatrizEnterosCuadrada(matriz1);
		objetoMatriz2 = new MatrizEnterosCuadrada(matriz2);
		objetoMatriz3 = new MatrizEnterosCuadrada(10);
	}
	
	@Test
	public void testA_MatrizEnterosComprobarMetodos() {
		
		int [] array = {124,65,96,85};
		String salidaEsperadaArray =  "[65, 85, 96, 124]";
		
		MatrizEnterosCuadrada.ordenaSeleccion(array);
		String salidaArray = Arrays.toString(array);
		assertEquals(salidaArray, salidaEsperadaArray);
			
		assertTrue("Error: El numero de filas de la matriz3 deberia ser 10 y es " + objetoMatriz3.getNumeroDeFilas(), 
				   objetoMatriz3.getNumeroDeFilas() == 10);
		assertTrue("Error: El numero de columnas de la matriz3 deberia ser 10 y es " + objetoMatriz3.getNumeroDeColumnas(),
				   objetoMatriz3.getNumeroDeColumnas() == 10);
	}
	
	@Test
	
	public void testB_MatrizEnterosToStringMatriz1() {
		String salidaMatriz = objetoMatriz1.toString();
		String salidaEsperadaMatriz = "Matriz:\n"
				+ "2	4" + "\n"
				+ "3	1";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);
	}
	
	@Test
	public void testC_MatrizEnterosToStringMatriz2() {
		String salidaMatriz = objetoMatriz2.toString();
		String salidaEsperadaMatriz = "Matriz:\n"
				+ "35	7	20	3" + "\n"
				+ "26	17	28	9" + "\n"
				+ "16	37	33	10" + "\n"
				+ "27	13	36	48";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);
	}
	
	
	@Test	
	public void testC_MatrizEnterosOrdenaMatriz1() {
		objetoMatFin= objetoMatriz1.matrizOrdenadaPorFilas();
		String salidaMatriz = objetoMatFin.toString();
		String salidaEsperadaMatriz = "Matriz:\n"
				+ "2	4" + "\n"
				+ "1	3";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);
	}
	
	@Test
	public void testD_MatrizEnterosOrdenaMatriz2() {
		objetoMatFin= objetoMatriz2.matrizOrdenadaPorFilas();
		String salidaMatriz = objetoMatFin.toString();
		String salidaEsperadaMatriz = "Matriz:\n"
				+ "3	7	20	35" + "\n"
				+ "9	17	26	28" + "\n"
				+ "10	16	33	37" + "\n"
				+ "13	27	36	48";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);
	}
	
}