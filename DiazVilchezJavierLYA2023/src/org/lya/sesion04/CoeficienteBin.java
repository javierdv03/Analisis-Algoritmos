package org.lya.sesion04;

public class CoeficienteBin {

	private int N;
	private int K;
	
	public CoeficienteBin(int N, int K) {
		if(this.N < this.K) {
			throw new IllegalArgumentException("");
		}
		this.K = K;
		this.N = N;
	}
	
	public int getN() {
		return N;
	}
	
	public int getK() {
		return K;
	}
	
	public void setK(int K) {
		this.K = K;
	}

	public int coefBinomialRecursivo() {
		if(K > N || K < 0 || N == 0) return 0;
		return coefBinomialRecursivo(N,K);
	}
	
	private int coefBinomialRecursivo(int n, int k) {
		if(k == 0 || k == n) return 1;
		if(n == 0) return 0;
		return coefBinomialRecursivo(n - 1, k - 1) + coefBinomialRecursivo(n - 1, k);
	}

	public int coefBinomialProgDinam() {
		int[][] tabla = new int[N+1][K+1];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i][0] = 1;
		}
		for (int i = 0; i < tabla[0].length; i++) {
			tabla[i][i] = 1;
		}
		for (int i = 2; i < tabla.length; i++) {
			for (int j = 1; j < i && j <= K; j++) {
				tabla[i][j] = tabla[i-1][j-1] + tabla[i-1][j];
			}
		}
		return tabla[N][K];
	}
}
