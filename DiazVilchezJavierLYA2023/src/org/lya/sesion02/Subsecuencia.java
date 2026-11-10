package org.lya.sesion02;

public class Subsecuencia {

	private int[] array;
	private int suma;
	private int primero;
	private int ultimo;
	
	public Subsecuencia(int[] arrayEnteros) {
		this.array = arrayEnteros;
	}

	public Subsecuencia(int numeroElementos) {
		this.array = new int[numeroElementos];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (95 + 95 + 1) + 95);
		}	
	}
	
	public void SubsecuenciaFuerzaBruta() {
		this.suma = 0;
		this.primero = 0;
		this.ultimo = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int suma = 0;
				for (int k = i; k <= j; k++) {
					suma += array[k];
				}
				if(suma > this.suma) {
					this.suma = suma;
					this.primero = i;
					this.ultimo = j;
				}
			}
		}
	}
	
    public void SubsecuenciaMejorado() {
    	this.suma = 0;
		this.primero = 0;
		this.ultimo = 0;
		for (int i = 0; i < array.length; i++) {
			int suma = 0;
			for (int j = i; j < array.length; j++) {
				suma += array[j];
				if (suma > this.suma) {
					this.suma = suma;
					this.primero = i;
					this.ultimo = j;
				}
			}
		}
	   
   }
    
    public void SubsecuenciaLineal() {
    	this.suma = 0;
		this.primero = 0;
		this.ultimo = 0;
		int suma = 0;
		int i = 0;
		
		for (int j = 0; j < array.length; j++) {
			suma += array[j];
			if(suma > this.suma) {
				this.suma = suma;
				this.primero = i;
				this.ultimo = j;
			}
			else if(suma < 0) {
				i = j + 1;
				suma = 0;
			}
		}
	}

	public int getPrimer() {
		return primero;
	}

	public int getSuma() {
		return suma;
	}

	public int getUltimo() {
		return ultimo;
	}
}
