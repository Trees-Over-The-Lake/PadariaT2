package nota_fiscal;

import Item.ItemInterface;

public interface NotaFiscalInterface {
	
	public void setId(String id);
	public String getId();
	
	public void adicionarItem(ItemInterface i);
}
