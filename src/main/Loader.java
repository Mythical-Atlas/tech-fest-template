// TechFest 2019 Template
// Programmed by Ben Correll (from Mr. Storm's template)
// Last Updated 11-20-2019

package main;

import java.io.*;
import java.util.Scanner;

import functions.IO;
import functions.Parser;
import functions.Simple;
import functions.Solutions;

class TechFest{
	public static void main(String[] args) throws IOException {
		int[][] in = Simple.readIntegersFromFile("inout/input.txt");
		
		int[][] out = in;
		
		for(int i = 0; i < Solutions.betweenNumbers(5, 5).length; i++) {
			System.out.println(Solutions.betweenNumbers(5, 5)[i]);
		}
		
		Simple.writeToFile("inout/output.txt", out);
	}
}