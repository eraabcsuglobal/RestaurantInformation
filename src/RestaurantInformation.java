
public class RestaurantInformation {
	public String restaurantName;
	public String businessAddress;
	public String city;
	public String state;
	public int zipCode;
	
	public RestaurantInformation()
	{
		// initialize variables
		restaurantName = "Huda";
		businessAddress = "32 S 18th Street";
		city = "Philadelphia";
		state = "PA";
		zipCode = 19103;
	}
	
	// print all variables
	public void PrintItems()
	{
		System.out.println(restaurantName);
		System.out.println(businessAddress);
		System.out.println(city + ", " + state + " " + zipCode);
	}
	
	// create main method to run program
	public static void main(String[] args) {
		RestaurantInformation restaurantInformation = new RestaurantInformation();
		restaurantInformation.PrintItems();
	}

}
