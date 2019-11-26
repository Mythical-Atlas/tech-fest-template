// TechFest 2019 Template
// Programmed by Ben Correll (from Mr. Storm's template)
// Last Updated 11-20-2019

package template;

import java.io.*;
import java.util.Scanner;

class TechFest{
	public static void main(String[] args) throws IOException {
		//declarations
		char myChar = 'A';
		int stringLength = 0;
		int asciiVal;
		String myString = "";
	 
		String[] file = loadFileToArray("inout/input.txt");
		
		for(int i = 0; i < file.length; i++) {
			System.out.println(file[i]);
			myString = file[i];
		}
	 
		//Use charAt to get individual chars in a string
		myChar = myString.charAt(1);
		System.out.println(myChar);
	 
		//Get the ASCII value of a char
		asciiVal = (int) myChar; System.out.println(asciiVal);
														 
		//Print char from ascii value
		myChar = (char)65;
		System.out.println(myChar);

		//loop through myString showing individual chars and ascii vals
		stringLength = myString.length();
		System.out.println("You entered the string: " + myString + " which has " + stringLength + " characters");
	 
		for (int x = 0; x < stringLength; x++) {
			myChar = myString.charAt(x);
			asciiVal = (int) myChar;
			System.out.println("The letter " + myChar + " has an ascii value of: " + asciiVal);
		}											
														 
		writeToFile("inout/CLHSout.txt", "Katie");
	}
	
	// USEFUL FUNCTIONS
	
	// compiles an array of strings into a single string separated by newlines
	public static String compileStrings(String[] in) {
		String output = "";
		
		for(int i = 0; i < in.length - 1; i++) {output += in[i] + '\n';}
		
		output += in[in.length - 1];
		
		return(output);
	}
	
	// find number of lines in file (end of line indicated by \n in file)
	public static int getFileLength(String path) throws IOException {
		Scanner inputFile = new Scanner(new File(path));
		int numLines = 0;
		
		while(inputFile.hasNext()) {
			numLines++;
			inputFile.nextLine();
		}
		
		inputFile.close();
		
		return(numLines);
	}
	
	// loads a file into an array of strings (each string is a line from the file)
	public static String[] loadFileToArray(String path) throws IOException {
		Scanner inputFile = new Scanner(new File(path));
		int numLines = getFileLength(path);
		int index = 0;
		
		String[] output = new String[numLines];
		
		while(inputFile.hasNext()) {
			output[index] = inputFile.nextLine();
			
			index++;
		}
		
		inputFile.close();
		
		return(output);
	}
	
	// loads a file into a string separated by newlines
	public static String loadFileToString(String path) throws IOException {
		Scanner inputFile = new Scanner(new File(path));
		int numLines = getFileLength(path);
		int index = 0;
		
		String[] output = new String[numLines];
		
		while(inputFile.hasNext()) {
			output[index] = inputFile.nextLine();
			
			index++;
		}
		
		inputFile.close();
		
		return(compileStrings(output));
	}

	// writes a string to a file (string may contain "\n"s to denote multiple lines)
	public static void writeToFile(String path, String content) throws IOException {
		PrintWriter outputFile = new PrintWriter(path);
		
		outputFile.print(content);
		
		outputFile.close();
	}
	
	// writes an array of strings to a file (strings compiled into single string separated by newlines
	public static void writeToFile(String path, String[] content) throws IOException {
		PrintWriter outputFile = new PrintWriter(path);
		
		outputFile.print(compileStrings(content));
		
		outputFile.close();
	}
}