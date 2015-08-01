package ua.lviv.lgs;

import java.io.ObjectInputStream.GetField;

public class Person {
	private String name;

	private int age;

	public Person() {
		this.age = 18;
		this.name = "Petro";
	
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
		
	}

	public String getName() {
		return this.name;
	}

	

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	



	}

//	@Override
//	public int compareTo(Person o) {
//		int compare1 = this.getFirstName().compareTo(o.getFirstName());
//		int compare2 = this.getLastName().compareTo(o.getLastName());
//		if (compare1 > -1 && compare2 >-1 && this.getAge() > o.getAge())
//			return 1;
//		else 
//			if (compare1 == -1 || compare2 == -1 || this.getAge() < o.getAge())
//				return -1;
//			else return 0;
//	}


