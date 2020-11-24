package org.jsp.classtype;

public class C {

	public static void main(String[] args) 
	{
		A a=new A();//type matching
		B b=new B();//type matching
		A a1=new B();//Implement-Up-casting
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof D);
		System.out.println(a1 instanceof Object);
		System.out.println(a1.x);
		System.out.println(a1.y);
		a.print();
		B b1=(B) a1;//Explicit-Down-casting
		System.out.println(b1.x);
		System.out.println(b1.y);
		b1.print();
		b1.view();
		Object O1=new Object();
		Object O2=new A();
		Object O3=new B();
		Object O4=new D();
		System.out.println("------------------------");
		A a2=new A();//type matching
		System.out.println(a2.x);
		System.out.println(a2.y);
		a2.print();
		A a3=new B();//Implement-Up-casting
		System.out.println(a3 instanceof A);
		System.out.println(a3 instanceof B);
		System.out.println(a3 instanceof D);
		System.out.println(a3 instanceof Object);
		System.out.println(a3.x);
		System.out.println(a3.y);
		a3.print();
		A a4=new D();//Implement-Up-casting
		System.out.println(a4 instanceof A);
		System.out.println(a4 instanceof B);
		System.out.println(a4 instanceof D);
		System.out.println(a4 instanceof Object);
		System.out.println(a4.x);
		System.out.println(a4.y);
		a4.print();
		System.out.println("------------Downcasting-------------");
		B bd=(B) a3;
		System.out.println(bd.x);
		System.out.println(bd.y);
		System.out.println(bd.a);
		System.out.println(bd.b);
		bd.print();
		bd.view();
		Object od=(Object) a3;
		System.out.println("------------------------");
		B b2=new B();//type matching
		System.out.println(b2.x);
		System.out.println(b2.y);
		b2.print();
		System.out.println(b2.a);
		System.out.println(b2.b);
		b2.print();
		B b3=new D();//Implement-Up-casting
		System.out.println(b3 instanceof A);
		System.out.println(b3 instanceof B);
		System.out.println(b3 instanceof D);
		System.out.println(b3 instanceof Object);
		System.out.println(b3.x);
		System.out.println(b3.y);
		b3.print();
		System.out.println(b3.a);
		System.out.println(b3.b);
		b3.view();
		a2.print();
		System.out.println("------------Downcasting-------------");
		D dd=(D) b3;
		System.out.println(dd instanceof A);
		System.out.println(dd instanceof B);
		System.out.println(dd instanceof D);
		System.out.println(dd instanceof Object);
		System.out.println(dd.x);
		System.out.println(dd.y);
		dd.print();
		System.out.println(dd.a);
		System.out.println(dd.b);
		dd.view();
		System.out.println(dd.d);
		System.out.println(dd.e);
		dd.show();
		B bd1=(B) b3;
		System.out.println(bd1.x);
		System.out.println(bd1.y);
		bd1.print();
		System.out.println(bd1.a);
		System.out.println(bd1.b);
		bd1.view();
		A ad=(A) b3;
		System.out.println(ad.x);
		System.out.println(ad.y);
		ad.print();
		Object od1=(Object) b3;
		System.out.println("------------------------");
		D d=new D();//type matching
		//D d1=(D) new B();Implicit type casting is not valid
		System.out.println(d instanceof A);
		System.out.println(d instanceof B);
		System.out.println(d instanceof D);
		System.out.println(d instanceof Object);
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.d);
		System.out.println(d.e);
		d.print();
		d.view();
		d.show();
		System.out.println("-----------DOWNDCASTING-------------");
		
	}

}
