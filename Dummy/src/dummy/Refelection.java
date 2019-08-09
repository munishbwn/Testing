package dummy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Refelection {
	public static Method[] method;
	
	public static void main (String[]args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Methods methods=new Methods();
		method = methods.getClass().getMethods();
		
		
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i].getName());
			String methodname=method[0].getName();
			method[i].invoke(methodname);
		}
	}

}
