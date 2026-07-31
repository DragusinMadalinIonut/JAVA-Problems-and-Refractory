package Refractoring;

public class Product {
	
	private String name = "";
	private double price = 0.0;
	private double shippingCost = 0.0;
	private int quantity = 0;
	
	public String getName() {return name;}
	public double getPrice() {return price; }
	public double getShippingCost(){return shippingCost;}
	public int getQuantity() {return quantity;}
	
	
	public Product(String name, double price, double shippingCost, int quantity) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price= price;
		this.shippingCost = shippingCost;
		this.quantity = quantity;
	}
//We have to make the more udnerstandable .
	//We will use an explaining variable
	public double getTotalCost() {
		double quantityDiscount = 0.0;
		//temporary variables to make sense of the code
		final boolean over50Products = (quantity > 50) || ((quantity * price)> 500);
		final boolean over25Products =  (quantity > 25)|| ((quantity * price) > 100);
final boolean over10Products =  (quantity >=10) || ((quantity * price) > 50);
	
if(over50Products) {
	quantityDiscount = .10;
}
else if(over25Products) {
	
	quantityDiscount=.07;
}	
else if(over10Products){
	quantityDiscount=.05;
}
double discount=((quantity -1) * quantityDiscount)* price;
return discount;  
}
/* bad code 
		if((quantity > 50) || (quantity * price)> 500) {
			quantityDiscount = .10;
		}else if((quantity > 25|| (quantity * price) > 100)){
			quantityDiscount=.07;
		}
		else if((quantity >=10|| (quantity * price) > 50)){
			quantityDiscount=.05;
		}
		double discount=((quantity -1) * quantityDiscount)* price;
		return discount;  
	}

	*/
}


//why it's bad to assign many different values to temporary values

/*
double temp = totalCost / numberOfProducts; //temp = Individual Cost of Product

temp = temp + shipping; //Individual Product Cost + Shipping

temp = temp - discount; //Individual Product Cost + Shipping -- Dscount 
*/

//too many values assgined. We may not keep all of them in mind during the month long prodcution process.

//less value implementation bellow:
/*
double indivProductCost = totalCost / numberaOfProducts; // temp = Individual product Cost
prodCostAndShipping = indivProductCost + shipping; //Individual Product Cost + Shipping
discountedProductCost = prodCostAndShipping - discount; //Individual Product Cost + Shipping - Discount
*/