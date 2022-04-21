package venda;

import java.util.ArrayList;
import java.util.HashMap;

import item.Item;
import nota_fiscal.NotaFiscal;

public class Venda implements VendaInterface{

    private static final HashMap<String, Item> banco_de_dados_items = new HashMap<>();

    static {
        banco_de_dados_items.put("14501926", new Item("14501926","Pão Integral", 15.77));
        banco_de_dados_items.put("39547612", new Item("39547612","Cerveja", 7.75));
        banco_de_dados_items.put("16437122", new Item("16437122","Doce", 4.18));
        banco_de_dados_items.put("28629351", new Item("28629351","Bolo", 16.06));
        banco_de_dados_items.put("74972239", new Item("74972239","Leite Integral", 18.44));
        banco_de_dados_items.put("49914660", new Item("49914660","Bala", 1.27));
        banco_de_dados_items.put("59802701", new Item("59802701","Vinho", 10.32));
        banco_de_dados_items.put("05938213", new Item("05938213","Requeijão", 5.84));
    }
	
	public NotaFiscal gerarNotaFiscal(ArrayList<String> codigos_barra) {
		NotaFiscal totalizacao = new NotaFiscal();
		
		for (String s : codigos_barra) {
			Item i = identificarItem(s);
			totalizacao.adicionarItem(i);
		}
		
		return totalizacao;
	}

	public Item identificarItem(String codigo_barra) {
		return banco_de_dados_items.get(codigo_barra);
	}

}
