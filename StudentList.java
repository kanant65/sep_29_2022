package com.javatest.bll;

import java.util.ArrayList;

public class StudentList {
	
	
		public static void main(String[] args) {
		  ArrayList<Students> students = new ArrayList<>();
		  
		  students.add(new Students("AF0216223",	"Aryan Raj",	    21, 	"Andra Pradhesh"));
		  students.add(new Students("AF0216224",	"Bivor Kumar",  	22, 	"Andra Pradhesh"));
		  students.add(new Students("AF0216227",	"SUSHMITA KUMARI",	23,     "Madhya Pradesh"));
		  students.add(new Students("AF0216231",	"Ragiv Zafar",	    24,	    "Maharashtra"));
		  students.add(new Students("AF0216232",	"RAHUL MAHTO",  	25,  	"Orissa"));
		  students.add(new Students("AF0216234",	"Nainsi Kumari",	19,     "Gujarath"));
		  students.add(new Students("AF0216236",	"MD ALI",	        26,	    "Madhya Pradesh"));
		  students.add(new Students("AF0216238",	"ABHISHEK KUMAR",	22,  	"Andra Pradhesh"));
		  students.add(new Students("AF0216240",	"AFROZ ANSARI", 	21,     "Maharashtra"));
		  students.add(new Students("AF0216259",	"RITIK RAJ",	    20, 	"Orissa"));
		  students.add(new Students("AF0216263",	"Anant Kumar",	    25,	    "Andra Pradhesh"));
		  students.add(new Students("AF0216305",	"BABU KUMAR",	    24, 	"Gujarath"));
		  students.add(new Students("AF0216307",	"NIKITA KUMARI",	23,	    "Madhya Pradesh"));
		  students.add(new Students("AF0216353",	"PRANAV PANDEY",	22,	    "Orissa"));
		  students.add(new Students("AF0216964",	"Radheshyam Kumar",	21, 	"Maharashtra"));
		  students.add(new Students("AF0216973",	"Ankur Utpal",  	19,	    "Gujarath"));
		  students.add(new Students("AF0217607",	"Banty Mishra",	    18,  	"Madhya Pradesh"));
		  students.add(new Students("AF0217615",	"RIYA KUMARI",  	20,	    "Madhya Pradesh"));
		  students.add(new Students("AF0217791",	"Priyadarshani Kumari",21,	"Maharashtra"));
		  students.add(new Students("AF0223373",	"Chanchal Thakur",	22,	    "Orissa"));
		  students.add(new Students("AF0221549",	"SATENDRA KUMAR",	23,	    "Maharashtra"));
		  students.add(new Students("AF0216212",	"Pappi Verma",	    24,     "Maharashtra"	));
		  students.add(new Students("AF0216244",	"Ramkrishna Kushwah",25,	"Andra Pradhesh"));
		  students.add(new Students("AF0216245",	"Yogita Tamoliya",	26,	    "Orissa"));
		  
	      
		  
		 
		//age more than 20
		System.out.println("Students with age greater than 20 years..");
			for(Students student: students) {
				if(student.getAge()>20)
				System.out.println(student);
			}
			
			
			
		 /* 
		//students from Andhra Pradesh
		System.out.println("Students from Andhra Pradesh...");
			for(Students student : students)
			{
				if(student.getState()=="Andhra Pradesh")
					System.out.println(student);
			}
			System.out.println();
		*/
		  
		  /*
			
		 //Sorting according to age
		 System.out.println("sorting by age...");  
		  
			Collections.sort(students,new AgeComparator());  
			
			Iterator<Students> itr=students.iterator();  
			
			while(itr.hasNext()){  
				Students employee=(Students)itr.next();  
				System.out.println(employee); 
			} 
			System.out.println();
			*/
		  
		  
		  /*
		    
		   //Sorting by name and State
		  Collections.sort(students, new Comparator<Students>() {
			  @Override
			  public int compare(Students s1, Students s2) {
			    return (s1.getStudentName().compareTo(s2.getStudentName()));
			  }
			});
		 Collections.sort(students, new Comparator<Students>() {
			  @Override
			  public int compare(Students s1, Students s2) {
			    return (s1.getState().compareTo(s2.getState()));
			  }
			});
			
		 for(Students student:students) {
			 System.out.println(student);
			 System.out.println();
		 }
			
		*/
		
		
		
		}

}



