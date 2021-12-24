package com.amadeus;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aadbddccx";
		str = "abccba";
		int i=0;
		String s = removePairsOfString(str);
		System.out.println("string without pairs : "+s);
	}

	private static String removePairsOfString(String str) {
		// TODO Auto-generated method stub
		if(str.isEmpty()) {
			System.out.println("String is empty...");
		}
		
		boolean isPairFound = true;
		
		while(isPairFound) {
			int i=0;
			isPairFound = false;
			while (i < str.length()) {
				int j = i + 1;
				if (j >= str.length()) {
					break;
				} else {
					if (str.charAt(i) == str.charAt(j)) {
						str = str.substring(0, i) + str.substring(j+ 1);
						isPairFound = true;
					} else {
						i += 1;
					}
				}

			}
		}
		
		return str;
	}

}
