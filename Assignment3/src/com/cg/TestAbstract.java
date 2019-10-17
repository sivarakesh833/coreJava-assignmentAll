package com.cg;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Abstract class cann't be instantiated.
	}
}

//we cann't declare abstract class as private and final.
abstract class AbstracttMain {
	// We have to declare class as abstract for this abstract method.
	abstract void method1();

	abstract void method2();
}

abstract class AbstractSub extends AbstracttMain {
	// we have to declare sub class as abstract.
	abstract void method1();

//we can override abstract methods of Abstract class.
	@Override
	void method2() {
		// TODO Auto-generated method stub

	}

	// We can declare class as abstract even if we don't have abstract methods.
	abstract class AbstractSub1 {
		void method2() {
			// TODO Auto-generated method stub

		}
	}
}
