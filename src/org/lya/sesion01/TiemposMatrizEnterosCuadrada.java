package org.lya.sesion01;

public class TiemposMatrizEnterosCuadrada {

	public static void main(String[] args) {
		long[] tiempos = new long[10];
		long start; 
		long end;
		System.out.println("N\tT(n)");
		for (int n = 32; n <= 8192; n*=2) {
			MatrizEnterosCuadrada m = new MatrizEnterosCuadrada(n);
			for (int i = 0; i < tiempos.length; i++) {
				
				start = System.nanoTime();
				m.matrizOrdenadaPorFilas();
				end = System.nanoTime();
				
				tiempos[i] = end - start;
			}
			long suma = 0;
			long max = 0;
			
			for (int i = 0; i < tiempos.length; i++) {
				suma += tiempos[i];
				if (tiempos[i] > max) {
					max = tiempos[i];
				}
			}
			System.out.println(n + "\t" + ( (suma-max) / (tiempos.length - 1) ) );
		}
	}
}
