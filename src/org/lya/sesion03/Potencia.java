package org.lya.sesion03;

public class Potencia {

	private int base;
	private int exponente;
	
	
	public Potencia() {
		
	}
	
	public Potencia(int a, int n) {
		if(n < 0) {
			throw new IllegalArgumentException("El exponente no puede ser negativo");
		}
		
		if (a <= 0) {
			throw new IllegalArgumentException("La base debe ser mayor que 0");
		}
		
		this.base=a;
		this.exponente=n;
	}
	private double exponenRecursivoDyV(int a, int n) {
		if(n==1) {
			return a;
		}
		if(n%2 ==0) {
			double valor = exponenRecursivoDyV(a,n/2);
			return (valor*valor);
		}else {
			return(a*exponenRecursivoDyV(a,n-1));
		}
	
	}

	public double exponenFuerzaBruta() {
		double resultado=1.0;
		for(int i=0;i<exponente;i++) {
			resultado=base*resultado;
		}
		return resultado;
	}
	public double exponenRecursivoDyV() {
		if(this.exponente==0) {
			return 1.0;
		}
		return exponenRecursivoDyV(this.base, this.exponente);
	}

	public void setExponente(int n) {
		this.exponente=n;
		
	}
	
	public int getExponente() {
		return exponente;
	}
}