package functions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IO {
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
		
		return(Parser.getStringWithChar(output, '\n'));
	}

	// writes a string to a file (string may contain "\n"s to denote multiple lines)
	// NOTE: this function is fairly inefficient if you're writing 1000+ lines, because you're appending every line to a string and then writing it
	// if you need to output a ton of lines to a file, just do it manually (declare the PrintWriter ONCE, then print a bunch of times instead of appending to a string, then close it)
	public static void writeToFile(String path, String content) throws IOException {
		PrintWriter outputFile = new PrintWriter(path);
		
		outputFile.print(content);
		
		outputFile.close();
	}
}
