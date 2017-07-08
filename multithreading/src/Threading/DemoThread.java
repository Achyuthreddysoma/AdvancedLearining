package Threading;

public class DemoThread {
	public static void main(String[] args) {

	Example1 e1= new Example1();
	//e1.start();
	Example1 e2= new Example1();
	//e2.start();
	{
	System.out.println(e1.getName());
	e1.setName("Raina");
	System.out.println(e2.getName());
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("achyuth");
	System.out.println(Thread.currentThread().getName());
	System.out.println(e1.getName());
	System.out.println(e1.isAlive());
	System.out.println(Thread.activeCount());
	}
	}
}