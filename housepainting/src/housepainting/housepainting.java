package housepainting;
import java.util.Scanner;
public class housepainting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int SqFtToPaint = 0;
		int Length = 0;
		int Width = 0;
		int Height = 0;
		int NumWindows = 0;
		int LengthWindow = 0;
		int WidthWindow = 0;
		int NumDoors = 0;
		int LengthDoor = 0;
		int WidthDoor = 0;
		double CostPerSqFt = 0.00;
		double CostToPaint = 0.00;
		
		
		
		System.out.println("Please enter the cost per square foot: ");
		CostPerSqFt = in.nextDouble();
		System.out.println("Please enter length of house: ");
		Length = in.nextInt();
		System.out.println("Please enter width of house: ");
		Width = in.nextInt();
		int normsidessqft = (Length * Width)*2;
		System.out.println("Please enter height of house: ");
		Height = in.nextInt();
		double peaksidessqft = ((Length * Width) + .5*(Length * (Height-Width)))*2;
		System.out.println("Please enter number of windows: ");
		NumWindows = in.nextInt();
		System.out.println("Please enter length of a window: ");
		LengthWindow = in.nextInt();
		System.out.println("Please enter width of a window: ");
		WidthWindow = in.nextInt();
		int sqftwindows = (LengthWindow * WidthWindow) * NumWindows;
		System.out.println("Please enter number of doors: ");
		NumDoors = in.nextInt();
		System.out.println("Please enter length of a door: ");
		LengthDoor = in.nextInt();
		System.out.println("Please enter width of a door: ");
		WidthDoor = in.nextInt();
		int sqftdoors = (LengthDoor * WidthDoor) * NumDoors;
		double totsqft = (peaksidessqft + normsidessqft)-(sqftwindows + sqftdoors);
	    CostToPaint = totsqft * CostPerSqFt;
		System.out.println("Your total paintable surface area is: ");
		System.out.println(totsqft);
		System.out.println("Your estimate is: ");
		System.out.println(CostToPaint);
		
		
	}

}
