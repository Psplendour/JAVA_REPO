package contains;
//The contains() method searches case sensitive char sequence. If the argument is not case sensitive, it returns false.
public class ContainsExample2 {

	public static void main(String[] args) {
		String str = "Hello Javatpoint readers";  
        boolean isContains = str.contains("Javatpoint");  
        System.out.println(isContains);  
        
        // Case Sensitive  
        System.out.println(str.contains("javatpoint")); // false  

	}

}
