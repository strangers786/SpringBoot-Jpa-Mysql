package com.yash.assignment2;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static Singleton instance;

	private Singleton() {
	}

	synchronized public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

}
