package functions;

public class Parser {
	// CONVERSIONS
	
	// converts array of strings to an array of integers
	public static int[] stringsToIntegers(String[] in) {
		int[] out = new int[in.length];
		
		for(int i = 0; i < in.length; i++) {out[i] = Integer.parseInt(in[i]);}
		
		return(out);
	}
	
	// converts array of integers to an array of strings
	public static String[] integersToStrings(int[] in) {
		String[] out = new String[in.length];
		
		for(int i = 0; i < in.length; i++) {out[i] = "" + in[i];}
		
		return(out);
	}
	
	
	
	// combines array of strings into single string separated by a custom character (examples = ' ' or '\n')
	public static String getStringWithChar(String[] in, char separator) {
		String out = "";
		
		for(int i = 0; i < in.length - 1; i++) {out += in[i] + separator;}
		
		out += in[in.length - 1];
		
		return(out);
	}
		
	// separates string into array of strings separated by a custom character (examples = ' ' or '\n')
	public static String[] getStringsNoChar(String in, char separator) {
		int separators = 0;
		
		for(int i = 0; i < in.length(); i++) {if(in.charAt(i) == separator) {separators++;}}
		
		String[] out = new String[separators + 1];
		int index = 0;
		
		for(int i = 0; i < out.length; i++) {
			out[i] = "";
		}
		
		for(int i = 0; i < in.length(); i++) {
			if(in.charAt(i) == separator) {index++;}
			else {out[index] += in.charAt(i);}
		}
		
		return(out);
	}

	
	
	// separates string into array of strings separated by a custom character (example = '\n', ' ' to separate into String[lines][spaces])
	public static String[][] getStringsNoChars(String inRaw, char separator1, char separator2) {
		String[] in = getStringsNoChar(inRaw, separator1);
		String[][] out = new String[in.length][];
		
		for(int i = 0; i < in.length; i++) {out[i] = Parser.getStringsNoChar(in[i], separator2);}
		
		return(out);
	}

	// separates string into array of integers separated by a custom character (example = '\n', ' ' to separate into String[lines][spaces])
	public static int[][] getIntegersNoChars(String inRaw, char separator1, char separator2) {
		String[] in = getStringsNoChar(inRaw, separator1);
		int[][] out = new int[in.length][];
		
		for(int i = 0; i < in.length; i++) {out[i] = stringsToIntegers(getStringsNoChar(in[i], separator2));}
		
		return(out);
	}
	
	// converts 2d array of integers to a single string (mainly for writing to file)
	public static String convertIntegersToString(int[][] in) {
		String out = "";
		
		for(int i = 0; i < in.length - 1; i++) {
			String[] temp = Parser.integersToStrings(in[i]);
			
			for(int x = 0; x < temp.length - 1; x++) {out += temp[x] + " ";}
			out += temp[temp.length - 1] + "\n";
		}
		
		String[] temp = Parser.integersToStrings(in[in.length - 1]);
		
		out += temp[temp.length - 1];
		
		return(out);
	}
	
	// converts 2d array of strings to a single string (mainly for writing to file)
	public static String convertStringsToString(String[][] in) {
		String out = "";
		
		for(int i = 0; i < in.length - 1; i++) {
			String[] temp = in[i];
			
			for(int x = 0; x < temp.length - 1; x++) {out += temp[x] + " ";}
			out += temp[temp.length - 1] + "\n";
		}
		
		String[] temp = in[in.length - 1];
		
		out += temp[temp.length - 1];
		
		return(out);
	}
}
