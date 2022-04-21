package nota_fiscal;

import java.util.HashMap;
import java.util.Map;

import item.ItemInterface;
import nota_fiscal.pair.Pair;

public class NotaFiscal implements NotaFiscalInterface {

	private String id;
	private HashMap<String, Pair<ItemInterface, Integer>> items_quantidades;
	private double totalizacao;
	
	
	public NotaFiscal() {
		this.id = "-1";
		this.items_quantidades = new HashMap<String, Pair<ItemInterface, Integer>>();
		this.totalizacao = 0;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setTotalizacao(double totalizacao) {
		this.totalizacao = totalizacao;
	}

	@Override
	public double getTotalizacao() {
		return this.totalizacao;
	}
	
	@Override
	public int getNumeroItems() {
		int numero_items = 0;
		
		for ( Pair<ItemInterface, Integer> item_quantidade : this.items_quantidades.values() ) 	
			numero_items += item_quantidade.getSecond();
		
		return numero_items;
	}

	@Override
	public void adicionarItem(ItemInterface i) {
		
		if (i == null)
			return;
		
		String chave = i.getId();
		
		if (this.items_quantidades.containsKey(chave)) {
			Pair<ItemInterface, Integer> atual = this.items_quantidades.get(chave).clone();
			int quantidade = atual.getSecond();
			atual.setSecond(quantidade +1);
			this.items_quantidades.put(chave ,atual);
			
		} else 
			this.items_quantidades.put(chave , new Pair<ItemInterface, Integer>(i,1));
		
		
		this.totalizacao += i.getPreco();
	}
	
	public String toString() {
		String nota_fiscal = new String();
		
		nota_fiscal += "----------Nota Fiscal-----------\n";
		nota_fiscal += "Item código \t Nome\n";
		nota_fiscal += "--------------------------------\n";
		
		for (Map.Entry<String, Pair<ItemInterface, Integer>> entrada : this.items_quantidades.entrySet()) {
			
			ItemInterface item = entrada.getValue().getFirst();
			int quantidade     = entrada.getValue().getSecond();
			
			double preco_item_x_quantidade = item.getPreco() * quantidade;
			
			nota_fiscal += entrada.getKey() + " \t " + item.getName() + "\n";
			nota_fiscal += "\t " + quantidade + " \t " + item.getPreco() + "\t " + preco_item_x_quantidade + "\n";
			
		}
		nota_fiscal += "--------------------------------\n";
		nota_fiscal += "TOTAL DE ITENS \t \t " + this.getNumeroItems() + "\n";
		nota_fiscal += "PREÇO TOTAL R$ \t \t " + this.totalizacao + "\n";
		
		return nota_fiscal;
	}
	
	public static NotaFiscal sum(NotaFiscal a, NotaFiscal b) {
		return a;
	}

}
