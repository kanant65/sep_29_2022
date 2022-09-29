package javatest;
import java.util.LinkedList;


public class Ques001 {

	public static void main(String[] args) {
		LinkedList<String> language=new LinkedList<String>();
		language.add("C");
		language.add("C++");
		language.add("Java");
		language.add("Kotlin");
		language.add("Python");
		language.add("Perl");
		language.add("Ruby");
		
		System.out.println(language);
		
		language.remove(5);
		language.remove("Kotlin");
		
		System.out.println("after removing 5th and Kotlin   :"+language);
		
		language.remove("Python");
		
		System.out.println("after Removing all Scripting languages   :"+language);
		
		language.clear();
		
		System.out.print("after removing all the elements from list   :"+language);
		
		
		
	}

}
