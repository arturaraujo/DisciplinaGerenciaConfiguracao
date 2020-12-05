package classes;

import java.util.Arrays;

import interfaces.ValoresItf;

public class Valores implements ValoresItf {
	
	private int[] numeros;
	
	private static final int TAMANHO_MAXIMO = 10;
	
	public Valores() {
		this.numeros = new int[TAMANHO_MAXIMO];
	}
	
	@Override
	public boolean ins(int v) {
		if (v <= 0)
			return false;
		
		for (int i = 0; i < this.numeros.length; i++) {
			if (this.numeros[i] == 0) {
				this.numeros[i] = v;
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int del(int i) {
		if (i <= 0)
			return 0;
		
		if (this.size() == 0)
			return -1;
		
		for (int j = 0; j < this.numeros.length; j++)
			if (this.numeros[j] == i) {
				this.numeros[j] = 0;
				return i;
			}
		
		return 0;
	}

	@Override
	public int size() {
		int size = 0;
		
		for (int i = 0; i < this.numeros.length; i++)
			if (this.numeros[i] != 0)
				size++;
		
		return size;
	}

	@Override
	public String toString() {
		return "Valores [numeros=" + Arrays.toString(numeros) + "]";
	}

}
