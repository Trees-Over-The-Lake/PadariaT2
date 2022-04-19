package venda;

import java.util.ArrayList;

import Item.Item;
import nota_fiscal.NotaFiscal;

public interface VendaInterface {
	 public NotaFiscal getTotalizacao(ArrayList<String> codigosDeBarra);
	 public Item identificarItem(String codigoDeBarra);
}
