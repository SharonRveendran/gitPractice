import java.util.HashMap;
import java.util.Scanner;
import model.Employee;

/**
 * Doing CRUD operation in collection
 * @author Sharon
 * created 23-02-2021
 */
public class Main {
    HashMap<Integer,Employee> employees = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) { 	
	Main main = new Main();
	while (true) {
	    System.out.println("Select your option\n1 : Create employee\n"
			       + "2 : Read employee\n3 : Update employee\n"
			       + "4 : Delete employee\n5 : Exit");
	    int option = scanner.nextInt();
	    switch (option) {
            case 1:
	        main.createEmployee();
		break;
			
            case 2:
	        main.readEmployee();
		break;
			
	    case 3:
	        main.updateEmployee();
		break;
			
	    case 4:
		main.deleteEmployee();
		break;
			
	    case 5:
	        System.exit(0);
	    }	
	}		
    }
	
    // Creating employee and storing in map
    private void createEmployee() {
    	Employee employee = new Employee();
    	System.out.println("Enter employee id");
    	int id = scanner.nextInt();
    	employee.setId(id);
    	scanner.nextLine();
    	System.out.println("Enter name");
    	String name = scanner.nextLine();
    	employee.setName(name);
    	System.out.println("Enter designation");
    	String designation = scanner.nextLine();
    	employee.setDesignation(designation);
    	System.out.println("Enter salary");
    	int salary = scanner.nextInt();
    	employee.setSalary(salary);
    	employees.put(id,employee);
    }
    
    // Displaying employee details based on employee id
    private void readEmployee() {
    	System.out.println("Enter the employee id");
    	int id = scanner.nextInt();
    	System.out.println(employees.get(id));
    }
    
    // Updating employee
    private void updateEmployee() {
    	System.out.println("Enter employee id");
    	int oldId = scanner.nextInt();
    	Employee employee = employees.get(oldId);
    	employees.remove(oldId);
    	System.out.println("What you want to update\n1 : Id \n"
    			           + "2 : Name\n3 : Designation\n4 : Salary");
    	int option = scanner.nextInt();
    	switch (option) {
    	case 1:
    	    System.out.println("Enter new Id");
    	    int newId = scanner.nextInt();
    	    employee.setId(newId);
    	    employees.put(newId,employee);
    	    break;
    		
    	case 2: 
    	    System.out.println("Enter new Name");
    	    String newName = scanner.nextLine();
    	    employee.setName(newName);
    	    employees.put(employee.getId(),employee);
    	    break;
    		
    	case 3: 
    	    System.out.println("Enter new Designation");
    	    String newDesignation = scanner.nextLine();
    	    employee.setDesignation(newDesignation);
    	    employees.put(employee.getId(),employee);
            break;
    		
    	case 4: 
    	    System.out.println("Enter new Salary");
    	    int newSalary = scanner.nextInt();
    	    employee.setSalary(newSalary);
    	    employees.put(employee.getId(),employee);
    	    break;
    		
    	default:
    	    System.out.println("Enter a valid input");
    	}
    }
    
    // Deleting employee
    private void deleteEmployee() {
    	System.out.println("Enter employee id");
    	employees.remove(scanner.nextInt());
    }
    
    // Displaying employee details based on employee id
    private void readEmployee() {
    	System.out.println("Enter the employee id");
    	int id = scanner.nextInt();
    	System.out.println(employees.get(id));
    }
    
    // Updating employee
    private void updateEmployee() {
    	System.out.println("Enter employee id");
    	int oldId = scanner.nextInt();
    	Employee employee = employees.get(oldId);
    	employees.remove(oldId);
    	System.out.println("What you want to update\n1 : Id \n"
    			   + "2 : Name\n3 : Designation\n4 : Salary");
    	int option = scanner.nextInt();
    	switch (option) {
    	case 1:
    	    System.out.println("Enter new Id");
            int newId = scanner.nextInt();
    	    employee.setId(newId);
            employees.put(newId,employee);
    	    break;
    		
    	case 2: 
    	    System.out.println("Enter new Name");
    	    String newName = scanner.nextLine();
    	    employee.setName(newName);
    	    employees.put(employee.getId(),employee);
    	    break;
    		
    	case 3: 
    	    System.out.println("Enter new Designation");
    	    String newDesignation = scanner.nextLine();
    	    employee.setDesignation(newDesignation);
    	    employees.put(employee.getId(),employee);
    	    break;
    		
    	case 4: 
    	    System.out.println("Enter new Salary");
    	    int newSalary = scanner.nextInt();
    	    employee.setSalary(newSalary);
    	    employees.put(employee.getId(),employee);
    	    break;
    		
    	default:
    	    System.out.println("Enter a valid input");
    	}
    }
    
    // Deleting employee
    private void deleteEmployee() {
    	System.out.println("Enter employee id");
    	employees.remove(scanner.nextInt());
    }
}
