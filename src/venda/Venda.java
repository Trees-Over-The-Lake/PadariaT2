package venda;

import java.util.ArrayList;

import Item.Item;
import nota_fiscal.NotaFiscal;

public class Venda implements VendaInterface{

	@Override
	public NotaFiscal getTotalizacao(ArrayList<String> codigosDeBarra) {
		NotaFiscal totalizacao = new NotaFiscal();
		
		for (String s : codigosDeBarra) {
			Item i = identificarItem(s);
			totalizacao.adicionarItem(i);
		}
		
		return totalizacao;
	}

	@Override
	public Item identificarItem(String codigoDeBarra) {
		// TODO Auto-generated method stub
		return null;
	}

}
