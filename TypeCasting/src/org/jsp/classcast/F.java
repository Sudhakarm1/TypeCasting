package org.jsp.classcast;

public class F {

	public static void main(String[] args) {
		E e=new E();
		D d=new E();
		d.print();
		d.print1();
		d.show();
		d.show1();
		E e1=(E) d;
		e1.print();
		e1.show1();
		e1.show();
	}

}
