package course;

public class EstruturaForeach {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		// FOR
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------");
		
		// FOREACH
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
