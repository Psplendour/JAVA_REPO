package durgaSynchronization;
public class MyThread3 extends Thread 
{
	Display2 d;
	String name;
	MyThread3(Display2 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
