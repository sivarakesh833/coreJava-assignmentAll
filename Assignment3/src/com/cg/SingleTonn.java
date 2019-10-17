package com.cg;

public class SingleTonn {

	private SingleTonn() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("SingleTon class private default constructor.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTonn singleTonn = new SingleTonn();
		SingleTonn singleTonn1 = new SingleTonn();
	}
}
//to make inheritance we have to use protected constructor,,
//to create object from another class there also we have to make constructor as protected.
/*
 * class ObjSingleTonn { SingleTonn singleTonn = new SingleTonn(); }
 * 
 * class InherSingleTon extends SingleTonn {
 * 
 * }
 */
