package durgaMultiThreading;
public class SleepDemo {
        public static void main(String[] args) throws InterruptedException {
		for(int i = 1;i<=5;i++)
		{
			System.out.println("Slide - "+i);
			Thread.sleep(3000);
		}
	}
	
}
