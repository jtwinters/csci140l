import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that asks the user for a file name and prints the number of
 * characters, words, and lines in that file.
 * 
 * November 23, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab22 {
	
	/**
	 * Entry point for program
	 * @param args Command line arguments
	 * @throws FileNotFoundException file was not found
	 */
	public static void main(String[] args) throws FileNotFoundException {

		System.out.print("File: ");
		// asks the user for the filename
		Scanner in = new Scanner(System.in);
		// creates the first scanner to read in user input
		File userFile = new File(in.nextLine());
		// passes in whatever file the user input to create an object in the
		// File class
		in.close(); // close the scanner

		// first scanner that reads userFile
		Scanner in1 = new Scanner(userFile);
		int i = 0; // declare and initialize i
		/* loop will continue to run as long as in1 has more characters 
		 * and i will continue to increment
		*/ 
		while (in1.hasNextLine()) {
			String lines = in1.nextLine();
			if (lines != "") {
				i++;
			}
		}
		// print out the number of lines in the text file
		System.out.println("Lines: " + i);
		in1.close(); // close the in1 scanner

		// second scanner that reads userFile
		Scanner in2 = new Scanner(userFile);
		int j = 0; // declare and initialize j
		/*
		 * loop will continue to run as long as in2 has more characters
		 * and j will continue to increment
		 */
		while (in2.hasNext()) {
			String words = in2.next();
			if (words != "") {
			j++;
			}
		}
		// print the number of words in the text file
		System.out.println("Words: " + j);
		in2.close(); // close the in2 scanner

		// third scanner that reads userFile
		Scanner in3 = new Scanner(userFile);
		in3.useDelimiter("");
		// used in place of something like .hasNextChar() or .nextChar() methods
		int y = 0;
		// loop will continue to run as long as in3 has more characters
		// and y will continue to increment
		while (in3.hasNext()) {
			char ch = in3.next().charAt(0); // process each character
			// as long as y does != '\n' then y will continue to increment
			if (ch != '\n') {
				y++;
			}
		}
		// prints the number of characters in the text file
		System.out.println("Chars: " + y);
		in3.close(); // close the 3rd scanner
	}
}
