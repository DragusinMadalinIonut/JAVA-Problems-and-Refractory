package Refractoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.StringBuilder;

public class Item {

	private HashMap<String, String> itemInfoHM;
	private String itemName= "";
	private ArrayList<Item> children = new ArrayList<Item>();
	
	public String getItemName() {return itemName;}
	public void setItemName(String itemName) {this.itemName = itemName;}
	
	public Item(String itemName) {
		super();
		setItemName(itemName);
		itemInfoHM = new HashMap<String, String>(20);
	}


	public void add(Item childNode) {
		children.add(childNode);
	}
	
	public void addItemInformation(String infoName, String info) {
		itemInfoHM.put(infoName, info);
	}
	
	public String getItemInformation(String infoName) {
		return itemInfoHM.get(infoName);
	}
	
	//String became an accumulate method
	//too many functions have accumulated the information into itemInformation
	//the usage of a string buffer is needed. Known as a collecting parameter
	//collects information as we move from method to method

	public String toString() {
		
		StringBuffer itemInfo = new StringBuffer();
		
		addItemInfoAndCildren( itemInfo);
		
		
		/*String itemInformation = itemName + "\n";
		*/
		
		/*if(!itemInfoHM.isEmpty()) {
			itemInformation += displayProductInfo();
		}
		*/
		/*Iterator<Item> it = children.iterator();
	
		while(it.hasNext()) {
			Item node = (Item)it.next();
			itemInformation += node.toString(); //node recursively calls to string. We can't pass a parameter. We need to create a new method 
		}*/
		return itemInfo.toString();
	} 
	
	private void addItemInfoAndCildren(StringBuffer itemInfo) {
		addItemInformation(itemInfo);
		addChildrenInformation(itemInfo);
		
	}
	
	private void addChildrenInformation(StringBuffer itemInfo) {
		Iterator<Item> it = children.iterator();
		
		while(it.hasNext()) {
			Item node = (Item)it.next();
			itemInfo.append(node.toString()); //node recursively calls to string. We can't pass a parameter. We need to create a new method 
		}
	}
	
	private void addItemInformation(StringBuffer itemInfo) {
		itemInfo.append("\n" + itemName + "");
		
		if(!itemInfoHM.isEmpty()) {
			itemInfo.append(displayProductInfo());
	}
	}
	
	
	
	public String displayProductInfo() {
		String productInfo = "";
		for (Map.Entry<String, String> entry : itemInfoHM.entrySet()){
			productInfo += entry.getKey() + ": " + entry.getValue() + "";
			
		}
		return productInfo;
	}
	

	public static void main(String[] args) {
		
		ItemBuilder products = new ItemBuilder("Products");
		products.addChild("Produce");
		products.addChild("Orange");
		products.addItemInformation("price", "$1.00");
		products.addItemInformation("Stock","100");
		products.displayALlITems();
	}
}

class ItemBuilder{
	ArrayList<Item> items = new ArrayList<Item>();
	
	private Item root;
	private Item current;
	private Item parent;
	
	public ItemBuilder(String rootName) {
		
		root = new Item(rootName);
		
		addItemToArrayList(root);
		current = root;
		parent = root;
		
		root.addItemInformation("Parent",parent.getItemName());
		
	}
	public void addItemInformation(String name, String value) {
		current.addItemInformation(name, value);
	}
	
	public void addChild(String child) {
		Item childNode = new Item(child);
		
		addItemToArrayList(childNode);
		current.add(childNode);
		parent=current;
		current=childNode;
		
		childNode.addItemInformation("Parent", parent.getItemName());

	}
	public void addSibling(String sibling) {
		Item siblingNode = new Item(sibling);
		
		addItemToArrayList(siblingNode);
		
		parent.add(siblingNode);
		current = siblingNode;
		siblingNode.addItemInformation("parent", parent.getItemName());
		
	}
	
	public void addItemToArrayList(Item newItem) {
		items.add(newItem);
	}
	
	public String toString() {
		return root.toString();
	}
	public void displayALlITems() {
		for(Item item : items) {
			System.out.println(item.getItemName() + ": " +
			item.displayProductInfo());
		}
	}
	public void editThisItem(String itemName) {
		for(Item item : items) {
			if(item.getItemName().equals(itemName)) {
				current = item;
				setItemsParent(current.getItemInformation("Parent"));
			}
			System.out.println(item.getItemName() + ":" +
			item.displayProductInfo());
		}
	}


public void setItemsParent(String parentItem) {
	for(Item item : items) {
		if(item.getItemName().equals(parentItem)) {
			parent = item;
		}
	}
}
}
