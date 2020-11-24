package orj.jsp.multilevel;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Generalization G=new Generalization();
		G.show(new B());
		G.show(new C());
		G.show(new D());
		G.show(new E());
	}
}
