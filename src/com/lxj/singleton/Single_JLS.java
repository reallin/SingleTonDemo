package com.lxj.singleton;

public class Single_JLS {
	//JLS(Java Language Specification)内部类，按需创建
	public static Single_JLS getInstance(){
		return Holder.single;
	}
	static class Holder{
		private static Single_JLS single = new Single_JLS();
	}
}
