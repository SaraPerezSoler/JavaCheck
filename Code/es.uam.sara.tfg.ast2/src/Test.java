import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Test<T, K> implements Collection<T>, List<T>{

	public BeanContext num;
	public ArrayList<Integer> in;
	public ColeccionInt i;
	public  int getNumCasa(List<List<T>> i) {
		return 1;
	}

	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String toString() {
		return "Test []";
	}
	
	public static void prueba(String a, String b, String i, int j) {
		
	}
}