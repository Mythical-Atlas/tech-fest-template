package functions;

import java.io.IOException;

public class Simple {
	// gets integers from file
	// works with any integer, including negatives
	// separates the integers into array like this: int[lines][spaces]
	// useful for inputs that have multiple numbers on each line, but works fine otherwise
	public static int[][] readIntegersFromFile(String path) throws IOException {return(Parser.getIntegersNoChars(IO.loadFileToString("inout/input.txt"), '\n', ' '));}
	
	// gets strings from file
	// separates the strings into array like this: int[lines][spaces]
	// useful for inputs that have multiple words on each line, but works fine otherwise
	public static String[][] readStringsFromFile(String path) throws IOException {return(Parser.getStringsNoChars(IO.loadFileToString("inout/input.txt"), '\n', ' '));}
	
	// converts 2d array of integers/characters/strings to a single string and then writes it to a file
	public static void writeToFile(String path, int[][] in) throws IOException {IO.writeToFile(path, Parser.convertIntegersToString(in));}
	public static void writeToFile(String path, String[][] in) throws IOException {IO.writeToFile(path, Parser.convertStringsToString(in));}
}
