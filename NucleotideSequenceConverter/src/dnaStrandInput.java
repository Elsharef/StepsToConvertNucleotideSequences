/*Elsharef
 * 22Nov15
 * Command line program that takes in one of the strands of a DNA double helix and returns the:
 * 		a. complementary DNA strand
 * 		b. opposite DNA strand
 * 		c. mRNA transcript
 * 
 */
import java.util.Scanner;
public class dnaStrandInput {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String input;
		System.out.print("Please enter a strand to convert given the following format(5 A C G T): ");
		input = stdIn.nextLine();
		
		System.out.println("Complementary strand: " + compStrand(input));
		System.out.println("Opposite strand: " + oppOrientation(input));
		System.out.println("mRNA Transcript: " + mRNATranscript(input));
	}
	public static String compStrand(String input){
		input = input.replaceAll("5", "3");
		//changing all T's and A's
		input = input.replaceAll("A", "X");
		input = input.replaceAll("T", "A");
		input = input.replaceAll("X", "T");
		
		//changing all G's and C's
		input = input.replaceAll("G", "X");
		input = input.replaceAll("C", "G");
		input = input.replaceAll("X", "C");
		return input;
	}
	public static String oppOrientation(String input){
		String temp = "" + input.charAt(0);
		for(int i = input.length() - 1;i > 1; i--){
			temp = temp + input.charAt(i);
		}
		input = temp;
		return input;
	}
	public static String mRNATranscript(String input){
		input = input.replaceAll("T", "U");
		return input;
	}
}


