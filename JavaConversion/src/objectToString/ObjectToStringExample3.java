package objectToString;
//Java Object to String Example: Converting StringBuilder
//code to check the palindrome string.
public class ObjectToStringExample3 {

	public static void main(String[] args) {
		String s="nitin";  
		StringBuilder sb=new StringBuilder(s);  
		sb.reverse();  
		String rev=sb.toString();//converting StringBuilder to String 
		
		if(s.equals(rev)){  
		System.out.println("Palindrome String");  
		}else{  
		System.out.println("Not Palindrome String");  
		}  

	}

}
