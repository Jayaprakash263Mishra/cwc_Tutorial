package codewithharry;
class Employee{
	int salary;
	String name;
	public int getSalary() {
		return salary;
		
	}
	public String  getName() {
		return name;
		
	}
	public void setName(String n) {
		name= n;
	}
}

public class FIRSTCUSTOMCLASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      problem1
		Employee harry= new Employee();
		harry.setName("code with harry");
		System.out.println(harry.getName());

	}

}
