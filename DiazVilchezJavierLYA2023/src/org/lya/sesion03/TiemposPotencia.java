package org.lya.sesion03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TiemposPotencia {

	
	private static String archivo = System.getProperty("user.dir") +
			File.separator + "src" +
			File.separator + "org" +
			File.separator + "lya" + 
			File.separator + "sesion03" +
			File.separator + "tiempos_potencia.csv";
	
	private static PrintWriter pw;
	
	public static void main(String[] args) throws FileNotFoundException {
		pw = new PrintWriter(new File(archivo));
		System.out.println("Exponente\tFB\tDyV");
		pw.println("Exponente;FB;DyV");
		System.out.println("---------------------");
		pw.println("---------------------");
		for (int n = 2; n <= 1073741824 && n >= 0; n*=2) {
			medirTiempo(n);
		}
		pw.close();
	}
	
	public static void medirTiempo(int n) {
		
		Potencia p = new Potencia(1, n);
		long start, end, max, suma;
		suma = 0;
		max = 0;
		int nIteracciones = 10;
		
		for (int i = 0; i < nIteracciones; i++) {
			start = System.nanoTime();
			p.exponenFuerzaBruta();
			end = System.nanoTime();
			suma += end - start;
			if(end - start > max) {
				max = end - start;
			}
		}
		System.out.print(p.getExponente() + "\t" + ((suma - max) / (nIteracciones - 1)));
		pw.print(p.getExponente() + ";" + ((suma - max) / (nIteracciones - 1)));
		
		suma = 0;
		max = 0;
		for (int j = 0; j < nIteracciones; j++) {
			start = System.nanoTime();
			p.exponenRecursivoDyV();
			end = System.nanoTime();
			
			suma += end - start;
			if(end - start > max) {
				max = end - start;
			}
		}
		System.out.println("\t" + ((suma - max) / (nIteracciones - 1)));
		pw.println(";" + ((suma - max) / (nIteracciones - 1)));
	}
}
