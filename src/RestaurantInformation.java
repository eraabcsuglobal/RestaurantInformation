
public class RestaurantInformation {
	public String restaurantName;
	public String businessAddress;
	public String city;
	public String state;
	public int zipCode;
	
	public RestaurantInformation()
	{
		restaurantName = "Huda";
		businessAddress = "32 S 18th Street";
		city = "Philadelphia";
		state = "PA";
		zipCode = 19103;
	}
	
	
	public void PrintItems()
	{
		System.out.println(restaurantName);
		System.out.println(businessAddress);
		System.out.println(city + ", " + state + " " + zipCode);
	}
	
	public static void main(String[] args) {
		RestaurantInformation restaurantInformation = new RestaurantInformation();
		restaurantInformation.PrintItems();
	}

}
