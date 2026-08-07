package Refractoring;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductGroup extends ProductComponent {
	ArrayList<ProductComponent> productComponents = new ArrayList<ProductComponent>();
	
	private String productGroupName;
	public ProductGroup(String productGroupName) {
		this.productGroupName = productGroupName;
	}
	public void add(ProductComponent newProductComponent) {
		productComponents.add(newProductComponent);
		
	}
	public void remove(ProductComponent newProductComponent) {
		productComponents.remove(newProductComponent);
	}
	
	public ProductComponent getProductComponent(int componentIndex) {
		return(ProductComponent) productComponents.get(componentIndex);
	}
	
	public String getProductGroupName() {
		return productGroupName;
	}
	
	@Override
	void displayProductInfo() {
		// TODO Auto-generated method stub
		System.out.println(getProductGroupName());
		
		Iterator<ProductComponent> productIterator = productComponents.iterator();
		while(productIterator.hasNext()) {
			ProductComponent productInfo = (ProductComponent) productIterator.next();
			productInfo.displayProductInfo();
		}
		System.out.println();
	}

		

}
