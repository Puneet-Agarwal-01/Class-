package myCaptain;

class Employee{
	String name , yoj , add;
	public void Description() {
		System.out.println(name + "\t" + yoj + "\t\t\t" + add);
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		
		System.out.println("Name\tYear of joining\t\tAddress");
		
		Employee E1 = new Employee();
		E1.name = "Robert";
		E1.yoj = "1994";
		E1.add = "64C-WallsStreet";
		
		Employee E2 = new Employee();
		E2.name = "Sam";
		E2.yoj = "2000";
		E2.add = "68D-WallsStreet";
		
		Employee E3 = new Employee();
		E3.name = "John";
		E3.yoj = "1999";
		E3.add = "26B-WallsStreet";
		
		E1.Description();
		E2.Description();
		E3.Description();
		
	}

}
