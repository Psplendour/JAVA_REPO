package breakExample;

public class WhileLoopBreak {

	public static void main(String[] args) {
		  int i=1; 
	    while(i<=10){  //while loop  
		   if(i==5){  
	            i++;  
	            break;//it will break the loop  
	        }  
	        System.out.println(i);  
	        i++;  
	    } 

	}

}
