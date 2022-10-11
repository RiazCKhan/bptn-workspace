package monday;


public class Challenge2 {
	
    public static void main(String[] args)
    {
        int tripMiles = 300;
        double price = 2.50;
        int milesPerGallon = 30;
        double numberOfGallons = tripMiles / milesPerGallon;
        double totalCost = numberOfGallons * price;
        System.out.println(totalCost);
    }
	
}
