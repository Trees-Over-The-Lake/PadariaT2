package venda.test;

import org.junit.Test;
import org.junit.Assert; 

import java.util.ArrayList;

import item.Item;
import nota_fiscal.NotaFiscal;
import venda.Venda;

public class VendaTest {

	@Test
	public void gerarNotaFiscalTest() {
		
		Venda padaria = new Venda();
		
		ArrayList<String> codigos_barra = new ArrayList<String>();
		codigos_barra.add("14501926");
		codigos_barra.add("14501926");
		codigos_barra.add("39547612");
		
		NotaFiscal nota_fiscal = padaria.gerarNotaFiscal(codigos_barra);

		Assert.assertEquals(39.29, nota_fiscal.getTotalizacao(),0);
		Assert.assertEquals(3,nota_fiscal.getNumeroItems());
	}
	
	@Test
	public void identificarItemTest() {
		
		Venda padaria = new Venda();
		
		Item pao = padaria.identificarItem("14501926");
		Assert.assertEquals("Pão Integral", pao.getName());
		
		Item bala = padaria.identificarItem("49914660");
		Assert.assertEquals("Bala", bala.getName());
		
		Item objNulo = padaria.identificarItem("22954560");
		Assert.assertEquals(null, objNulo);
		
	}
}
