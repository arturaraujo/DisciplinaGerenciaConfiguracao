package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.ValoresItf;

public class Valores implements ValoresItf {
	
	private List<Integer> numeros;
	
	public Valores() {
		this.numeros = new ArrayList<Integer>();
	}

	@Override
	public boolean ins(int v) {
		if (v > 0) {
			this.numeros.add(v);
			return true;
		}
		
		return false;
	}

	@Override
	public int del(int i) {
		if (this.numeros.isEmpty())
			return -1;
		
		if (this.numeros.contains(i)) {
			this.numeros.remove(Integer.valueOf(i));
			return i;
		}
		
		return 0;
	}

	@Override
	public int size() {
		return this.numeros.size();
	}

}
