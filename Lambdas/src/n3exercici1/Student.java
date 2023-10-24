package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	String name = "";
	int age = 0;
	String course = "";
	float note = 0f;
	
	public Student(String name, int age, String course, float nota) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.note = nota;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public float getNote() {
		return note;
	}

	public void setNota(float note) {
		this.note = note;
	}
	
	
	
	public void showNameAge() {
		
		System.out.println("nom: " + name + " // edat: " + age);
	}
	
	public void filter(List<Student> aList){
		if(Character.toString(this.name.toLowerCase().charAt(0)).equals("a")) {
			aList.add(new Student(this.name,this.age,this.course,this.note));
		}
	}
	
	public void fiveOrMore() {
		if(this.note >= 5) {
			System.out.println(this.name);
		}
	}
	
	public void fiveOrMoreAndNotPhp() {
		if(this.note >= 5 && !(this.course.equals("php"))) {
			System.out.println(this.name);
		}
	}
	
	public void java18() {
		if(this.age >= 18 && this.course.equals("java")) {
			System.out.println(this.name);
		}
	}
}
