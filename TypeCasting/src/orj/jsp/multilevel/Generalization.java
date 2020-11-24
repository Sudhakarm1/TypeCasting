package orj.jsp.multilevel;

public class Generalization 
{
	public void show(A a)
	{
		a.print();
		if(a instanceof B)
		{
			B b=(B) a;
			b.print1();
		}
		else if (a instanceof C)
		{
			C c=(C) a;
			c.print2();
		}
		else if(a instanceof D)
		{
			D d=(D) a;
			d.print3();
		}
		else if(a instanceof E)
		{
			E e=(E) a;
			e.print5();
		}
	}
}
