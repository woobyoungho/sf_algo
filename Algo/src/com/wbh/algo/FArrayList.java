package com.wbh.algo;

public class FArrayList<T> implements FList {

	private Object[] array;
	
	public FArrayList() {
		array = new Object[0];
	}
	
	@Override
	public void add(Object v) {
		int size = size();
		Object[] temp = array;
		
		array = new Object[size + 1];
		for(int i = 0; i < temp.length; i++) {
			array[i] = temp[i];
		}		
		array[temp.length] = v;
	}
	
	@Override
	public Object get(int idx) {
		return (T)array[idx];
	}

	@Override
	public int size() {
		return array.length;
	}

	@Override
	public void remove(int idx) {
		array[idx - 1] = null;
		for(int i = 0; i < array.length - idx + 1; i++) {
			if(array[idx + i + 1] != null) {
				array[idx - 1] = array[idx];
			}
		}
	}

}
