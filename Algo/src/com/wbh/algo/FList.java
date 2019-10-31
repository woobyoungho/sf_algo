package com.wbh.algo;

public interface FList<T> {
	//<T> 리턴타입이 String인지 int인지 마음대로 바꿀 수 있다.
	T get(int idx);
	void add(T str);
	int size();
	void remove(int idx);
}
