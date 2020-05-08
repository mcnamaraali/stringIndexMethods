
public class StringIndexMethods {

	public static void main(String[] args) {
		String letters = "abcd";
		
		System.out.printf("'c' is located at index %d%n", letters.indexOf('c'));
		System.out.printf("'c' is located at index %d%n", letters.lastIndexOf('c'));
		System.out.printf("'cd' is located at index %d%n", letters.indexOf("cd"));
		System.out.printf("'cd' is located at index %d%n", letters.indexOf("cd", 2));
		
		//always put variables together at the top but this is only to demonstrate this code as together. 
		String sHap = "Happy ";
		String sBir = "Birthday";
		
		System.out.printf("%s%n", sHap.concat(sBir)); //remember sHap and sBir are immutable
		
		
		char[] charArray = {'a', 'b', 'c', 'd'};
		boolean bool = true;
		Object obj = "helloObj";
		
		System.out.printf("part of a char array = %s%n", String.valueOf(charArray),3,3);
		System.out.printf("boolean = %s%n", String.valueOf(bool));
		System.out.printf("Obj = %s%n", String.valueOf(obj));
		
		
		
		

	}

}
