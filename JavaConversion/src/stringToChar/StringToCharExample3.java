package stringToChar;
//The toCharArray() method of String class converts this string into character array.
public class StringToCharExample3 {

	public static void main(String[] args) {
		String s1="hello";    
		char[] ch=s1.toCharArray();    
		for(int i=0;i<ch.length;i++){    
		System.out.println("char at "+i+" index is: "+ch[i]);   
	}

}
}
