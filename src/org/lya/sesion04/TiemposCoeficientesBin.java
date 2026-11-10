package org.lya.sesion04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TiemposCoeficientesBin {
	
	private static String archivo = System.getProperty("user.dir") +
			File.separator + "src" +
			File.separator + "org" +
			File.separator + "lya" + 
			File.separator + "sesion04" +
			File.separator + "tiempos_coeficientebin.csv";
	
	private static PrintWriter pw;

	public static void main(String[] args) throws FileNotFoundException {
		pw = new PrintWriter(new File(archivo));
		System.out.println("N\tDyV\tPD");
		pw.println("N;DyV;PD");
		for (int n = 4; n <= 20; n++) {
			medirTiempo(n);
		}
		pw.close();
	}
	
   public static void medirTiempo(int n) {
		
		CoeficienteBin c = new CoeficienteBin(2*n, n);
		long start, end, max, suma;
		suma = 0;
		max = 0;
		int nIteracciones = 10;
		
		for (int i = 0; i < nIteracciones; i++) {
			start = System.nanoTime();
			c.coefBinomialRecursivo();
			end = System.nanoTime();
			suma += end - start;
			if(end - start > max) {
				max = end - start;
			}
		}
		System.out.print("(" + c.getN() + ", " + c.getK() + ")" + "\t" + ((suma - max) / (nIteracciones - 1)));
		pw.print(c.getK() + ";" + ((suma - max) / (nIteracciones - 1)));
		
		suma = 0;
		max = 0;
		for (int j = 0; j < nIteracciones; j++) {
			start = System.nanoTime();
			c.coefBinomialProgDinam();
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