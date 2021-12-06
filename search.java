///////////ItemType Class///////////////////////

package array;

public class ItemType {
	private String name;
	private double deposit;
	private double costPerDay;
	
	public ItemType(){
		
	}
	
	public ItemType(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	
	@Override
	public String toString() {
		return name+deposit+costPerDay;
	}
	

}

////////////ItemTypeBO Class/////////////////////////////

package array;

public class ItemTypeBO {
	
	
	public void add(ItemType object ,ItemType[] itemTypeArray,Integer index){
		itemTypeArray[index] = object;
		System.out.println("New Item added Successfully..");
		
	}
	
	public void search(String search, ItemType[] itemTypeArray){
		boolean isFound=true;
		for(ItemType item:itemTypeArray){
			if(item.getName().equals(search)){
				isFound=false;
				System.out.println("Searched Item Type is:");
				System.out.println(item);
				if (!isFound) {
					System.out.println("Searched Item Type not found");
				}
			}
			
		}
	}
	
	public void display(ItemType[] itemTypeArray){
		for (int i = 0; i < itemTypeArray.length; i++) {
			System.out.printf("Item Type Number : ", i + 1);
			System.out.println(itemTypeArray[i]);
		}
	}

}


////////////////////////Main Class//////////////////////////////////

package array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ItemType[] itemTypeArray = null;
		int itemTypeCount = 0;
		String search = null;
		ItemTypeBO itemTypeBO = null;
		ItemType itemType = null;
		
		Scanner sc=new Scanner(System.in);
		
		itemTypeBO = new ItemTypeBO();
		System.out.println("Enter Number of Item: ");
		itemTypeCount = Integer.parseInt(sc.next());

		itemTypeArray = new ItemType[itemTypeCount];
		for (int i = 0; i < itemTypeCount; i++) {
			itemType = new ItemType();

			System.out.printf("Enter the Item Type Name: \n", i + 1);
			itemType.setName(sc.next());

			System.out.println("Enter the Deposit Amount");
			itemType.setDeposit(Double.parseDouble(sc.next()));

			System.out.println("Enter the Cost per day");
			itemType.setCostPerDay(Double.parseDouble(sc.next()));
			itemTypeBO.add(itemType, itemTypeArray, i);
		}
		itemTypeBO.display(itemTypeArray);
		System.out.println("Enter the Name of item to be searched");
		search = sc.next();
		itemTypeBO.search(search, itemTypeArray);	

		
		
	}
	


}

