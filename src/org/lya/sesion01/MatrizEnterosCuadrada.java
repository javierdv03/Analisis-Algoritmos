package org.lya.sesion01;

public class MatrizEnterosCuadrada {

	 private int[][] matriz;
	
	public MatrizEnterosCuadrada(int[][] matriz) {
		this.matriz = new int[matriz.length][matriz[0].length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				this.matriz[i][j] = matriz[i][j];
			}
		}
	}
	
	public MatrizEnterosCuadrada(int n) {
		this.matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) { 
				this.matriz[i][j] = (int) (Math.random() * 96);
			}
		}
	}
	
	public MatrizEnterosCuadrada matrizOrdenadaPorFilas() {
	
		MatrizEnterosCuadrada copia = new MatrizEnterosCuadrada(this.matriz);
		for (int i = 0; i < matriz.length; i++) {
			ordenaSeleccion(copia.matriz[i]);
		}
		return copia;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	public int getNumeroDeFilas() {
		return this.matriz.length;
	}
	
	public int getNumeroDeColumnas() {
		return this.matriz[0].length;
	}
	
	public String toString() {
		   String salida = "Matriz:\n";
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                if (j != matriz[i].length - 1)
	                    salida += matriz[i][j] + "\t";
	                else
	                    salida += matriz[i][j];
	            }
	            if (i != matriz.length - 1)
	                salida += "\n";
	        }
	        return salida;
	}

	public static void ordenaSeleccion(int[] array) {
		  int n = array.length;

		    for (int i = 0; i < n - 1; i++) {
		        int minIndex = i;
		        for (int j = i + 1; j < n; j++) {
		            if (array[j] < array[minIndex]) {
		                minIndex = j;
		            }
		        }

		        int temp = array[minIndex];
		        array[minIndex] = array[i];
		        array[i] = temp;
		    }
		}
	
	
}
