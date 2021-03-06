package venda;

import java.util.ArrayList;

import item.Item;
import nota_fiscal.NotaFiscal;

public interface VendaInterface {
	 public NotaFiscal gerarNotaFiscal(ArrayList<String> codigosDeBarra);
	 public NotaFiscal aplicarDesconto(NotaFiscal nf, double desconto);
	 public Item identificarItem(String codigoDeBarra);
}
