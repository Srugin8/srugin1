package programs;

	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	public class PangramChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        boolean isPangram = isPangram(input);

	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String input) {
	        // Convert the input to lowercase to make it case-insensitive
	        input = input.toLowerCase();

	        Set<Character> alphabetSet = new HashSet<>();
	        
	        // Iterate through the characters in the input
	        for (char c : input.toCharArray()) {
	            if (Character.isLetter(c)) {
	                alphabetSet.add(c);
	            }
	        }

	        // Check if the set contains all 26 letters
	        return alphabetSet.size() == 26;
	    }
	}