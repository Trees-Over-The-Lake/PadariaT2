package nota_fiscal;

import item.ItemInterface;

public interface NotaFiscalInterface {
	
	public void setId(String id);
	public String getId();
	
	public void setPrecoTotal(double totalizacao);
	public double getPrecoTotal();
	public double getPrecoTotalComDesconto();
	
	public void setDesconto(double desconto);
	public double getDesconto();
	
	public int getNumeroItems();
	
	public void adicionarItem(ItemInterface i);
	
	public String toString();
}
