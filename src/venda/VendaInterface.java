package venda;

import java.util.ArrayList;

import item.Item;
import nota_fiscal.NotaFiscal;

public interface VendaInterface {
	 public NotaFiscal gerarNotaFiscal(ArrayList<String> codigosDeBarra);
	 public Item identificarItem(String codigoDeBarra);
}
