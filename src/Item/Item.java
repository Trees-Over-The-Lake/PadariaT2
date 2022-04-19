package Item;

public class Item implements ItemInterface{

	private String id;
	private String name;
	private double preco;
	
	public Item() {
		this.name  = "";
		this.preco = 0;
	}
	
	public Item(String name, double preco) {
		this.name  = name;
		this.preco = preco;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPreco() {
		return this.preco;
	}

	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}
	
}
