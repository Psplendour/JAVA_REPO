package durgaSynchronization;
public class Display1 {
	//public void wish(String name) 
	public synchronized void wish(String name)
	{
		for(int i=1 ;i<=5;i++) 
		{
			System.out.print("Good Morning:");
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(name);
			}
		}
	}
