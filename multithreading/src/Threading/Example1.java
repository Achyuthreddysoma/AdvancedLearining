package Threading;

public class Example1 extends Thread{
	
	public void run(){
		
		for(int i=0;i<10;i++);
		{
			System.out.println("user defined thread");
		}
		
	}
}
