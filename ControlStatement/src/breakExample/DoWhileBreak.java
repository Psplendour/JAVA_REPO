package breakExample;

public class DoWhileBreak {

	public static void main(String[] args) {
	    int i=1;  
	    //do-while loop  
	    do{  
	        if(i==5){  
	           //using break statement  
	           i++;  
	           break;//it will break the loop  
	        }  
	        System.out.println(i);  
	        i++;  
	    }while(i<=10);  
	}  

	}


