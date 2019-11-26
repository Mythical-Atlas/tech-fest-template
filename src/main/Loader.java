// TechFest 2019 Template
// Programmed by Ben Correll (from Mr. Storm's template)
// Last Updated 11-20-2019

package main;

import java.io.*;
import java.util.Scanner;

import functions.IO;
import functions.Parser;
import functions.Simple;

class TechFest{
	public static void main(String[] args) throws IOException {
		int[][] in = Simple.readIntegersFromFile("inout/input.txt");
		
		int[][] out = in;
		
		Simple.writeToFile("inout/output.txt", out);
	}
}