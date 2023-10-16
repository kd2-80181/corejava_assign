package com.sunbeam;

public class Box<T> {
	
    private T obj;
	
	public T get()
	{
		return this.obj;
	}
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	

}
