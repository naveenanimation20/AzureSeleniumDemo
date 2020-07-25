package lombokTest;

import java.lang.reflect.Method;

/**
 * 
 * @author NaveenKhunteta
 *
 */
public class EmpTest {

	public static void main(String ar[]) {
		Employee e = new Employee();
		Class className = null;
		try {
			className = Class.forName("lombokTest.Employee");
			Method[] methods = className.getDeclaredMethods();
			System.out.println("Number of methods in " + className + " = " + methods.length);

			int i = 0;
			int k = 0;
			while (methods.length > i) {
				e.m1();
				e.m2();
				e.m3();
				e.m4();
				while (k < 3) {
					System.out.print("printing m5 counter " + (k + 1) + "\t");
					e.m5();
					break;
				}
				e.m6();
				e.m7();
				e.m8();
				e.m9();
				e.m10();

				i++;
				k++;

			}

		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println("Class " + className + " could not be found");
		}

	}

}
