package binding;

public class Dog1 extends Animal1 {
    void eat()
	{
		System.out.println("dog is eating...");
	} 
	public static void main(String[] args) {
		Animal1 a = new Dog1();  
		  a.eat();  
    }

}
