package Refractoring;
import java.util.ArrayList;


public class Store {
	public ArrayList<Product> theProducts = new ArrayList<Product>();


	
	public Store() {
        theProducts = new ArrayList<Product>();
    }

    public void addAProduct(Product newProduct) {
        theProducts.add(newProduct);
    }

    public void getCostOfProducts() {
        for (Product product : theProducts) {
           final int numOfProducts = product.getQuantity();
           final String prodName = product.getName();
           final double cost = product.getTotalCost()/product.getQuantity();
        	
           final double costWithDiscount = product.getTotalCost() / product.getQuantity();
           final double costWithoutDiscount = product.getPrice() + product.getShippingCost();
           //now that the code is broken into variables they are easier to keep track of
           System.out.println("Total cost for " + numOfProducts + " " + prodName + cost);
           System.out.println ("Cost per product"+ costWithDiscount);
           System.out.println("Savings per product" + (costWithoutDiscount - costWithDiscount)+ "\n" );
           /*
        	System.out.println("Total cost for " + product.getQuantity() + " " + product.getName());
            
            // Check for division by zero before calculating unit cost
            if (product.getQuantity() != 0) {
                System.out.println("Cost per product: " + (product.getTotalCost() / product.getQuantity()));
            }
            
            System.out.println("Total cost per item + shipping: " + (product.getPrice() + product.getShippingCost()));
        }
    }
    */
}
}
}