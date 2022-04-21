package nota_fiscal;

import item.ItemInterface;

public interface NotaFiscalInterface {
	
	public void setId(String id);
	public String getId();
	public void setTotalizacao(double totalizacao);
	public double getTotalizacao();
	public int getNumeroItems();
	
	public void adicionarItem(ItemInterface i);
	
	public String toString();
}
