import java.util.*;

public class Main {
	public static void main(String[] str) throws InvalidSalaryException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the name ");
		String name = sc.next();
		
		System.out.println("please enter the gender ");
		String gender = sc.next();
		
		System.out.println("please enter the salary ");
		int salary = sc.nextInt();
		
		Candidate c;
		
		if(salary < 10000) {
			throw new InvalidSalaryException("salary cannot be less than 10000");
		}else {
			c = new Candidate(name,gender, salary);
		}
		
		System.out.println("name of candidate " + c.name);
		System.out.println("gender of candidate " + c.gender);
		System.out.println("salary of candidate " + c.salary);
		
	}
}
