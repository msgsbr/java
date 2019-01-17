package course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstruturaLista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		// ADD ON LIST
		list.add("Marcelo");
		list.add("Fernanda");
		list.add("Fiona");		
		list.add("Pedro");
		list.add("Marta");
		list.add("Anna");
		list.add("Paulo");
		list.add("Patricia");
		list.add("Ruth");
		
		// ADD ON ESPECIFIC INDEX
		list.add(2, "Marco");
		
		// LIST SIZE
		System.out.println("List Size: " + list.size());	
		// FOREACH
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-------------------");

		// REMOVE ON ESPECIFIC VALUE
		list.remove("Anna");	
		// REMOVE ON ESPECIFIC INDEX
		list.remove(1);		
		// FOREACH
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		// PREDICATE, LAMBDA EXPRESSION
		list.removeIf(x -> x.charAt(0) == 'M');
		// FOREACH
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		// FIND A INDEX POSITION OF AN ELEMENT
		System.out.println("Index of Fiona: " + list.indexOf("Fiona"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
		
		System.out.println("-------------------");
		
		// FILTER ELEMENTS ON LIST W/ LAMBDA EXPRESSION
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList()); // LAMBDA ON LIST
		// FOREACH
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		// FILTER FIRST ELEMENT ON LIST W/ LAMBDA EXPRESSION
		String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("-------------------");
		String nameNull = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(nameNull);
	}

}
