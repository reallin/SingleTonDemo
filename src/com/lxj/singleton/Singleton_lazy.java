package com.lxj.singleton;

public class Singleton_lazy {
	private static Singleton_lazy singleton ;
	public static Singleton_lazy getInstance(){
	if(singleton == null){ 
		singleton = new Singleton_lazy();		
	}
	return singleton;
	}
}
