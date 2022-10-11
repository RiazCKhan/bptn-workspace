package monday;

public class SwappingNums {

	public static void main(String[] args) {

		int x, y, z = 0;

		System.out.println("Enter the value of X and Y");

		x = 10;
		y = 20;

		System.out.println("before swapping numbers: "+x +" "+ y);  

		z = x; // z = 10
		x = y; // x = 20
		y = z; // y = 10

		System.out.println("After swapping: "+x +" " + y);

		
	}

}
