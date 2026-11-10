package org.lya.sesion02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SubsecuenciaTestJUnit5 {
	
	Subsecuencia objSecuenciaProblema1;
	Subsecuencia objSecuenciaProblema2;
	Subsecuencia objSecuenciaProblema3;
	Subsecuencia objSecuenciaProblema4;


	@Before
	
	public void setUp() throws Exception {
		
		int[] datos1 = { 1, 2, 3, 0, 0, 0,-1, 0 };
		int[] datos2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] datos3 = {-1,-2,-3,-4,-5,-6,-7,-8 };
		int[] datos4 = { 1, 1, 1, 1, 1, 1, 1, 1 };
 
		objSecuenciaProblema1 = new Subsecuencia(datos1);
		objSecuenciaProblema2 = new Subsecuencia(datos2);
		objSecuenciaProblema3 = new Subsecuencia(datos3);
		objSecuenciaProblema4 = new Subsecuencia(datos4);
		
	}

	@Test
       public void testA_SubsecuenciaNormal() {

		objSecuenciaProblema1.SubsecuenciaFuerzaBruta();
        assertTrue(objSecuenciaProblema1.getSuma() == 6);
        assertTrue(objSecuenciaProblema1.getPrimer() == 0);
        assertTrue(objSecuenciaProblema1.getUltimo() == 2);

        objSecuenciaProblema1.SubsecuenciaMejorado();
        assertTrue(objSecuenciaProblema1.getSuma() == 6);
        assertTrue(objSecuenciaProblema1.getPrimer() == 0);
        assertTrue(objSecuenciaProblema1.getUltimo() == 2);

        objSecuenciaProblema1.SubsecuenciaLineal();
        assertTrue(objSecuenciaProblema1.getSuma() == 6);
        assertTrue(objSecuenciaProblema1.getPrimer() == 0);
        assertTrue(objSecuenciaProblema1.getUltimo() == 2);

    }

	@Test
    public void testB_SubsecuenciaCero() {

		objSecuenciaProblema2.SubsecuenciaFuerzaBruta();
        assertTrue(objSecuenciaProblema2.getSuma() == 0);
        assertTrue(objSecuenciaProblema2.getPrimer() == 0);
        assertTrue(objSecuenciaProblema2.getUltimo() == 0);

        objSecuenciaProblema2.SubsecuenciaMejorado();
        assertTrue(objSecuenciaProblema2.getSuma() == 0);
        assertTrue(objSecuenciaProblema2.getPrimer() == 0);
        assertTrue(objSecuenciaProblema2.getUltimo() == 0);

        objSecuenciaProblema2.SubsecuenciaLineal();
        assertTrue(objSecuenciaProblema2.getSuma() == 0);
        assertTrue(objSecuenciaProblema2.getPrimer() == 0);
        assertTrue(objSecuenciaProblema2.getUltimo() == 0);

    }

	@Test
    public void testC_SubsecuenciaNegativos() {

		objSecuenciaProblema3.SubsecuenciaFuerzaBruta();
        assertTrue(objSecuenciaProblema3.getSuma() == 0);
        assertTrue(objSecuenciaProblema3.getPrimer() == 0);
        assertTrue(objSecuenciaProblema3.getUltimo() == 0);
        
        objSecuenciaProblema3.SubsecuenciaMejorado();
        assertTrue(objSecuenciaProblema3.getSuma() == 0);
        assertTrue(objSecuenciaProblema3.getPrimer() == 0);
        assertTrue(objSecuenciaProblema3.getUltimo() == 0);
        
        objSecuenciaProblema3.SubsecuenciaLineal();
        assertTrue(objSecuenciaProblema3.getSuma() == 0);
        assertTrue(objSecuenciaProblema3.getPrimer() == 0);
        assertTrue(objSecuenciaProblema3.getUltimo() == 0);
    }

	@Test
    public void testD_SubsecuenciaIguales() {
 
		objSecuenciaProblema4.SubsecuenciaFuerzaBruta();
        assertTrue(objSecuenciaProblema4.getSuma() == 8);
        assertTrue(objSecuenciaProblema4.getPrimer() == 0);
        assertTrue(objSecuenciaProblema4.getUltimo() == 7);

        objSecuenciaProblema4.SubsecuenciaMejorado();
        assertTrue(objSecuenciaProblema4.getSuma() == 8);
        assertTrue(objSecuenciaProblema4.getPrimer() == 0);
        assertTrue(objSecuenciaProblema4.getUltimo() == 7);

        objSecuenciaProblema4.SubsecuenciaLineal();
        assertTrue(objSecuenciaProblema4.getSuma() == 8);
        assertTrue(objSecuenciaProblema4.getPrimer() == 0);
        assertTrue(objSecuenciaProblema4.getUltimo() == 7);

    }
	
}
