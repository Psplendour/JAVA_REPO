package compareTo;
//Java String compareTo(): empty string
public class CompareToExample1 {

	public static void main(String[] args) {
		String s1="hello";  
		String s2="";  
		String s3="me";  
		System.out.println(s1.compareTo(s2));  
		System.out.println(s2.compareTo(s3));  

	}

}
//If you compare string with blank or empty string, it returns length of the string. 
//If second string is empty, result would be positive. 
//If first string is empty, result would be negative.