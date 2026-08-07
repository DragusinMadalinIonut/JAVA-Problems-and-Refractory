package Refractoring;

public class ProductSystem {

	public static void main(String[] args) {
		ProductComponent produce = new ProductGroup("Produce");
		ProductComponent cereal = new ProductGroup("Cereal");
		
		ProductComponent everyProduct = new ProductGroup("All Products\n");
		
		everyProduct.add(produce);
		everyProduct.add(cereal);
		
		produce.add(new Product2("Tomato",1.99));
		produce.add(new Product2("Orange",0.99));
		produce.add(new Product2("Potato",0.50));
		
		cereal.add(new Product2("Special K", 3.68));;
		
		everyProduct.displayProductInfo();
	}

}
