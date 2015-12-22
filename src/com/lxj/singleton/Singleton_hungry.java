package com.lxj.singleton;

public class Singleton_hungry {
	private static Singleton_hungry singleton = new Singleton_hungry();
	private static Singleton_hungry getInstance(){
		return singleton;
	}
}
