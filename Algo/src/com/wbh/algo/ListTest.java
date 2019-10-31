package com.wbh.algo;

public class ListTest {
	public static void main(String[] args) {
		FList<String> list = new FArrayList();
		
		list.add("str");
		list.add("안녕하세요.");
		list.add("4422");
		list.add("22222");
		
		
		for(int i = 0; i <list.size(); i++) {
			System.out.println((String)list.get(i));
		}
	}
}
