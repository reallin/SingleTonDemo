package com.lxj.singleton;

public class Singleton_normal {
	private static Singleton_normal singleton;
	private Singleton_normal(){
		
	}
	public static Singleton_normal getIntance(){
		if(singleton == null){
			synchronized(singleton){
				if(singleton == null){
					singleton = new Singleton_normal();
				}
			}
			
		}
		return singleton;
	}
}
