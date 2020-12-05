package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classes.Valores;
import interfaces.ValoresItf;

public class Tests {
	
	@Before
	public void before() {
		
	}
	
	@Test
	public void adicionarValorValido() {
		Double random =	Math.random() * 10;
		Double valorAbsoluto = Math.abs(random);
		Integer inteiro = valorAbsoluto.intValue();
		
		inteiro++; // Garantindo que sera maior que zero
		
		System.out.println(random);
		System.out.println(inteiro);
		
		ValoresItf valores = new Valores();
		Boolean retorno = valores.ins(inteiro);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void adicionarZero() {
		ValoresItf valores = new Valores();
		Boolean retorno = valores.ins(0);
		
		Assert.assertFalse(retorno);
	}
	
	@Test
	public void adicionarValorMenorQueZero() {
		Double random =	Math.random();
		Double valorAbsoluto = Math.abs(random);
		Integer inteiro = valorAbsoluto.intValue();
		
		inteiro = inteiro * -1;
		inteiro--; // Garantindo que sera menor que zero
		
		System.out.println(inteiro);
		
		ValoresItf valores = new Valores();
		boolean retorno = valores.ins(inteiro);
		
		Assert.assertFalse(retorno);
	}
	
	@Test
	public void removerDeListaVazia() {
		ValoresItf valores = new Valores();
		
		int retorno = valores.del(1);
		
		Assert.assertEquals(-1, retorno);
	}
	
	@Test
	public void removerComSucesso() {
		ValoresItf valores = new Valores();
		
		int valor = 1;
		
		valores.ins(valor);
		
		int retorno = valores.del(valor);
		
		Assert.assertEquals(valor, retorno);
	}
	
	@Test
	public void testarTamanhoComSucesso() {
		ValoresItf valores = new Valores();
		
		Double random =	Math.random() * 10;
		Double valorAbsoluto = Math.abs(random);
		Integer quantidade = valorAbsoluto.intValue();
		
		quantidade++;
		
		int[] valoresInt = new int[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			valoresInt[i] = i + 1;
		}
		
		for (int i = 0; i < valoresInt.length; i++) {
			valores.ins(valoresInt[i]);
		}
		
		int retorno = valores.size();
		
		Assert.assertEquals(valoresInt.length, retorno);
	}

}
