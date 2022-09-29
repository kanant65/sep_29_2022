package com.javatest.bll;
import java.util.LinkedList;


public class Ques001 {

	public static void main(String[] args) {
		LinkedList<String> languages=new LinkedList<String>();
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("Python");
		languages.add("Perl");
		languages.add("Ruby");
		
		System.out.println(languages);
		/*
		languages.remove(5);
		languages.remove("Kotlin");
		
		System.out.println("after removing 5th and Kotlin   :"+languages);
		*/
		/*LinkedList<String> scriptinglanguages = new LinkedList<>();
		scriptinglanguages.add("Python");
		scriptinglanguages.add("Ruby");
		scriptinglanguages.add("Perl");
		
		System.out.println("Scripting languagess : " +scriptinglanguages);
		languages.removeAll(scriptinglanguages);
		
		System.out.println("after Removing all Scripting languages   :"+languages);*/
		/*
		languages.clear();
		
		System.out.print("after removing all the elements from list   :"+languages);*/
		
		
		
	}

}
