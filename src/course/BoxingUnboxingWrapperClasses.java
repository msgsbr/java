package course;

public class BoxingUnboxingWrapperClasses {

	public static void main(String[] args) {
		
		int x = 20;
		// BOXING
		Object obj = x;
		System.out.println(obj);
		
		// UNBOXING W/ CASTING
		int y = (int) obj; // CASTING 
		
		System.out.println(y);
		
		
		// WRAPPER CLASSES (NO CASTINGS)
		int z = 40;
		// BOXING
		Integer obj2 = z;
		System.out.println(obj2);
		// UNBOXING
		int w = obj2;
		System.out.println(w);
		

	}

}
