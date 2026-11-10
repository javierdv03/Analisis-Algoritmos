package org.lya.sesion02;

public class TiemposSubsecuencia {

	public static void main(String[] args) {
		long[] tiempos = new long[10];
		long start;
		long end;
		System.out.println("N\tT(FB)\tT(Mejorado)\tT(Lineal)");
		for (int n = 64; n <= 8192; n *= 2) {
			Subsecuencia s = new Subsecuencia(n);
			
			//Tiempo algoritmo fuerza bruta
			for (int i = 0; i < tiempos.length; i++) {
				start = System.nanoTime();
				s.SubsecuenciaFuerzaBruta();
				end = System.nanoTime();
				
				tiempos[i] = end - start;
			}

			System.out.print(n + "\t" + tiempoMedio(tiempos));
			
			//Tiempo SubsecuenciaMejorado
			for (int i = 0; i < tiempos.length; i++) {
				start = System.nanoTime();
				s.SubsecuenciaMejorado();;
				end = System.nanoTime();
				
				tiempos[i] = end - start;
			}
			
			System.out.print(n + "\t" + tiempoMedio(tiempos));
			
			//Tiempo SubsecuenciaLineal
			for (int i = 0; i < tiempos.length; i++) {
				start = System.nanoTime();
				s.SubsecuenciaLineal();;
				end = System.nanoTime();
				
				tiempos[i] = end - start;
			}
			System.out.println(n + "\t" + tiempoMedio(tiempos));
		}
		}	
	
	public static long tiempoMedio(long[] tiempos) {
		long suma = 0;
		long max = 0;
		
		for (int i = 0; i < tiempos.length; i++) {
			suma += tiempos[i];
			if (tiempos[i] > max) {
				max = tiempos[i];
			}
		}
		return (suma - max) / (tiempos.length - 1);
	}
	}

