package javaExceptionPropagation;
//Program which describes that checked exceptions are not propagated
public class TestExceptionPropagation2 {
		void m(){  
		  //throw new java.io.IOException("device error");//checked exception  so getting the complileTime Error
		  }  
		  void n(){  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handeled");}  
		  }  
		  public static void main(String args[]){  
		   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
		   obj.p();  
		   System.out.println("normal flow");  

	}

}
