
public class RetailItemDemo {
	
	public static void main(String[] args) 
	{
		
		RetailItem item1 = new RetailItem();
		RetailItem item2 = new RetailItem();
		RetailItem item3 = new RetailItem();
		
		item1.setDescription("Jacket");
		item2.setDescription("Designer Jeans");
		item3.setDescription("Shirt");		
		
		try {
			item1.setUnits(-12);
			item2.setUnits(40);
			item3.setUnits(20);
		}
		catch(InvalidUnitNumber ex)
		{
			System.out.println(ex.getMessage());
		}
		try {
			item1.setPrice(-59.95);
			item2.setPrice(34.95);
			item3.setPrice(24.95);
		}
		catch(InvalidPrice ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("Item Number           Description         Units On Hand          Price");
		System.out.println("----------------------------------------------------------------------");		
		System.out.println("Item 1:               " + item1.getDescription() + "              " + item1.getUnits() + "                     " + item1.getPrice());
		System.out.println("Item 2:               " + item2.getDescription() + "      " + item2.getUnits() + "                     " + item2.getPrice());
		System.out.println("Item 3:               " + item3.getDescription() + "               " + item3.getUnits() + "                     " + item3.getPrice());
		
	}

}
