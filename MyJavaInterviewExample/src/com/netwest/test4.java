package com.netwest;

import java.util.Map;
import java.util.TreeMap;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new TreeMap<Integer, String>();
		mp.put(11, "A");
		mp.put(11, "B");
		mp.put(null, "C");
		
		System.out.println(mp.size());
	}

}
