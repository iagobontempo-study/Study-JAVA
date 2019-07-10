package entitites;

public class OrderItem {

	private Integer quantity;
	private double price; 
	
	private Product product;				// LEMBRAR DE ADICIONAR VARIAVEIS SE NESCESSARIAS COMO ESSA 

	public OrderItem(Integer quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return quantity * price;		
	}
	
	public String toString() {
		return product.getName()
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity 
				+", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
	
	
}
