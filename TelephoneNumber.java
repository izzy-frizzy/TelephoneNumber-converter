import java.util.Scanner;
public class TelephoneNumber {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a telephone number using letters : ");
		
		String input = scnr.nextLine(),spaceStorage = "", num = "",teleNum = "";
		
			for (int i = 0; i< input.length(); i++) {
			
				char letters = input.charAt(i);
			
				if(String.valueOf(letters).matches(" ")) { 
				
				spaceStorage += letters;
			}
			else {
				num += letters;
			}
		}
			num = num.toLowerCase();
						
			for(int i = 0; i<7; i++) {
				
				if (i == 3) {
					teleNum+= '-';
				} 
				if (num.charAt(i) == 'a' || num.charAt(i) == 'b' || num.charAt(i) == 'c') {
					
					teleNum += '2';
				}
				else if (num.charAt(i) == 'd' || num.charAt(i) == 'e' || num.charAt(i) == 'f') {
					teleNum += '3';
					
				}
				else if (num.charAt(i) == 'g' || num.charAt(i) == 'h' || num.charAt(i) == 'i') {
					teleNum += '4';
					
				}
				else if (num.charAt(i) == 'j' || num.charAt(i) == 'k' || num.charAt(i) == 'l') {
					teleNum += '5';
					
				}
				else if (num.charAt(i) == 'm' || num.charAt(i) == 'n' || num.charAt(i) == 'o') {
					teleNum += '6';
					
				}
				else if (num.charAt(i) == 'p' || num.charAt(i) == 'q' || num.charAt(i) == 'r' || num.charAt(i) == 's') {
					teleNum += '7';
					
				}
				else if (num.charAt(i) == 't' || num.charAt(i) == 'u' || num.charAt(i) == 'v') {
					teleNum += '8';
					
				}
				else if (num.charAt(i) == 'w' || num.charAt(i) == 'x' || num.charAt(i) == 'y' || num.charAt(i) == 'z') {
					teleNum += '9';
					
				}
					
			}
					System.out.println(teleNum);
					scnr.close();
	}

}