package functions;

// input = String[][]
// output = anything
public class Solutions {
	// converts a roman numeral to a normal (arabic) number
	public static int romanToArabic(String in) {
		/*
			I             1
			IV            4
			V             5
			IX            9
			X             10
			XL            40
			L             50
			XC            90
			C             100
			CD            400
			D             500
			CM            900 
			M             1000
		*/
		
		int value = 0;
		
		for(int i = 0; i < in.length(); i++) {
			char currentChar = in.toLowerCase().charAt(i);
			
			if(i + 1 < in.length()) {
				char nextChar = in.toLowerCase().charAt(i + 1);
				
				     if(currentChar == 'i' && nextChar == 'v') {value += 4; i++;}
				else if(currentChar == 'i' && nextChar == 'x') {value += 9; i++;}
				else if(currentChar == 'x' && nextChar == 'l') {value += 40; i++;}
				else if(currentChar == 'x' && nextChar == 'c') {value += 90; i++;}
				else if(currentChar == 'c' && nextChar == 'd') {value += 400; i++;}
				else if(currentChar == 'c' && nextChar == 'm') {value += 900; i++;}
				else if(currentChar == 'i') {value += 1;}
				else if(currentChar == 'v') {value += 5;}
				else if(currentChar == 'x') {value += 10;}
				else if(currentChar == 'l') {value += 50;}
				else if(currentChar == 'c') {value += 100;}
				else if(currentChar == 'd') {value += 500;}
				else if(currentChar == 'm') {value += 1000;}
			}
			else {
				     if(currentChar == 'i') {value += 1;}
				else if(currentChar == 'v') {value += 5;}
				else if(currentChar == 'x') {value += 10;}
				else if(currentChar == 'l') {value += 50;}
				else if(currentChar == 'c') {value += 100;}
				else if(currentChar == 'd') {value += 500;}
				else if(currentChar == 'm') {value += 1000;}
			}
		}
		
		return(value);
	}
	
	// converts a normal (arabic) number to a roman numeral
	public static String arabicToRoman(int in) {
		/*
			I             1
			IV            4
			V             5
			IX            9
			X             10
			XL            40
			L             50
			XC            90
			C             100
			CD            400
			D             500
			CM            900 
			M             1000
		*/
		
		String out = "";
		int value = in;
		
		while(value > 0) {
			     if(value >= 1000) {
				out += "M";
				value -= 1000;
			}
			else if(value >= 900) {
				out += "CM";
				value -= 900;
			}
			else if(value >= 500) {
				out += "D";
				value -= 500;
			}
			else if(value >= 400) {
				out += "CD";
				value -= 400;
			}
			else if(value >= 100) {
				out += "C";
				value -= 100;
			}
			else if(value >= 90) {
				out += "XC";
				value -= 90;
			}
			else if(value >= 50) {
				out += "L";
				value -= 50;
			}
			else if(value >= 40) {
				out += "XL";
				value -= 40;
			}
			else if(value >= 10) {
				out += "X";
				value -= 10;
			}
			else if(value >= 9) {
				out += "IX";
				value -= 9;
			}
			else if(value >= 5) {
				out += "V";
				value -= 5;
			}
			else if(value >= 4) {
				out += "IV";
				value -= 4;
			}
			else if(value >= 1) {
				out += "I";
				value -= 1;
			}
		}
		
		return(out);
	}

	// gets a list of numbers between (inclusive) two given numbers
	public static int[] betweenNumbers(int one, int two) {
		int[] out = new int[Math.abs(one - two) + 1];
		int index = 0;
		
		if(one < two) {
			for(int i = one; i <= two; i++) {
				out[index] = i;
				index++;
			}
		}
		else if(one > two) {
			for(int i = one; i >= two; i--) {
				out[index] = i;
				index++;
			}
		}
		else {out = new int[]{one};}
		
		return(out);
	}
}
