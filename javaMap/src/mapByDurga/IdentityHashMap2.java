package mapByDurga;
import java.util.*;
public class IdentityHashMap2 {

	public static void main(String[] args) {
		IdentityHashMap m = new IdentityHashMap();
		Integer I1= new Integer(10);
		Integer I2= new Integer(10);
		
		m.put(I1, "Pawan");
		m.put(I2, "Kalyan");
		System.out.println(m);
		}
}
