package Threading;

public class Sample2{
	
public static void main(String[] args) {
	
	Example2 s1= new Example2();
	
	s1.setPriority(Thread.MAX_PRIORITY);
	
	Example2 s2= new Example2();
	
	s2.setPriority(Thread.MIN_PRIORITY);
	
