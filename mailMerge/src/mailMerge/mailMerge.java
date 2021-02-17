package mailMerge;
import java.util.Scanner;
public class mailMerge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String promptText1 = ("Please enter your first name");
		System.out.println(promptText1);
		String response1 = in.nextLine();
		
		String promptText2 = ("Please enter your last name");
		System.out.println(promptText2);
		String response2 = in.nextLine();
	
		String promptText3 = ("Please enter your house number");
		System.out.println(promptText3);
		String response3 = in.nextLine();
		
		String promptText4 = ("Please enter your street");
		System.out.println(promptText4);
		String response4 = in.nextLine();
		
		
		String replaceText1 = ("Dear <firstName> <lastName>");
		replaceText1 = replaceText1.replace("<firstName> <lastName>", response1 +" "+ response2); 
		System.out.println(replaceText1);
		
		String replaceText2 = ("Please confirm that your address is <houseNumber> <street>");
		replaceText2 = replaceText2.replace("<houseNumber> <street>", response3 + " "+ response4);
		System.out.println(replaceText2);
		
		String promptText5 = ("Is this address correct?");
		System.out.println(promptText5);
		String response5 = in.nextLine();
		
		String replaceText3 = ("Your answer is: <yORn> Goodbye!");
		replaceText3 = replaceText3.replace("<yORn>", response5);
		System.out.println(replaceText3);
		


	}{


	}

}
