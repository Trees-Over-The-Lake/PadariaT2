package nota_fiscal;

import java.util.HashMap;

import Item.ItemInterface;
import nota_fiscal.pair.Pair;

public class NotaFiscal implements NotaFiscalInterface {

	String id;
	HashMap<String, Pair<ItemInterface, Integer>> notaFiscal;
	
	public NotaFiscal() {
		notaFiscal = new HashMap<String, Pair<ItemInterface, Integer>>();
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
	public void adicionarItem(ItemInterface i) {
		
		if (i == null)
			return;
		
		String key = i.getId();
		
		if (this.notaFiscal.containsKey(key)) {
			Pair<ItemInterface, Integer> curr = this.notaFiscal.get(i).clone();
			int quantidade = curr.getSecond();
			curr.setSecond(quantidade +1);
			this.notaFiscal.put(key ,curr);
			
		} else {
			this.notaFiscal.put(key , new Pair<ItemInterface, Integer>(i,0));
		}
	}
}
