package com.globallogic;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//str1 = atoday dis mondayy
		//str2 = day
		
		//countMatchStirng();
		
//		linkedList = 1,2,3,4,5,6
//		rLinkedList = 6,5,4,3,2,1
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void countMatchStirng() {
		String str1 = "atoday dis mondayy";
		String str2 = "day";
		
		boolean isMatched = true;
		int count = 0;
		while(isMatched) {
			int strLength = 0;
			for(int i=0; i<str2.length(); i++) {
				if(!str1.contains(str2.charAt(i)+"")) {
					isMatched = false;
					break;
				}else {
					int index = str1.indexOf(str2.charAt(i));
					str1 = str1.substring(0,index)+str1.substring(index+1);
					strLength++;
				}
			}
			
			if(strLength == str2.length()) {
				count++;
			}
		}
		
		System.out.println("count : "+count);
		
	}

}
