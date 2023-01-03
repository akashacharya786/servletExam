package model;

public class Product {
	private int id;
	private String Prod_name;
	private String Cat;
	
	public Product() {
		
	}

	public Product(int id, String prod_name, String cat) {
		super();
		this.id = id;
		Prod_name = prod_name;
		Cat = cat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProd_name() {
		return Prod_name;
	}

	public void setProd_name(String prod_name) {
		Prod_name = prod_name;
	}

	public String getCat() {
		return Cat;
	}

	public void setCat(String cat) {
		Cat = cat;
	}
	
}
