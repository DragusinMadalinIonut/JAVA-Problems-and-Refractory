package Refractoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Item {

	private HashMap<String, String> itemInfoHM;
	private String itemName= "";
	private ArrayList<Item> children new ArrayList<Item>();
	
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
	
	public void additemInformaton(String infoName, String info) {
		itemInfoHM.put(infoName, info);
	}
	
	public String getItemInformation(String infoName) {
		return itemInfoHM.get(infoName);
	}
	public String toString() {
		String itemInformation = itemName + "\n";
		if(!itemInfoHM.isEmpty()) {
			itemInformation += displayProductInfo();
		}
		Iterator<Item> it = children.iterator();
		
		while(it.hasNext()) {
			Item node = (Item)it.next();
			itemInformation += node.toString();
		}
		return itemInformation;
	}
	
	
}
