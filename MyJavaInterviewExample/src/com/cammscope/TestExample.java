package com.cammscope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    // Input = "thehdhnajkkksgajshaaasuhhhhshjwijkkkhsjnrutttksjhhhskla";
	   // Output: k-2 a-1 h-2 t-1

	   Set<String> st = new HashSet<String>(); 
	   String str = "thehdhnajkkksgajshaaasuhhhhshjwijkkkhsjnrutttksjhhhskla";
	   
	   for(int i=0; i<str.length(); i++) {
		   st.add(str.charAt(i)+"");
	   }
	   
	   System.out.println("set ----"+st);
	   
	   Map<String, Integer> mp = new HashMap<String, Integer>();
	   for(String s:st) {
		   String ch = s+s+s;
		  
		   Boolean isPresent = true;
		   while(isPresent) {
//			   System.out.println("match : "+ch);
			   if(str.contains(ch)) {
				   int index1 = str.indexOf(ch);
				   int index2 = index1+2;
				   str = str.substring(0,index1)+str.substring(index2+1);
				   System.out.println("str --- "+str);
				   if(mp.containsKey(s)) {
					   mp.put(s, mp.get(s)+1);
				   }else {
					   mp.put(s, 1);
				   }
			   }else {
				   isPresent = false;
			   }
		   }
	   }
	   
	   System.out.println("output : "+mp);
	}
}


