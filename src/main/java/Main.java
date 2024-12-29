import department.Department;
import department.Employee;
import managers.*;

public class Main {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", 5000);
        Employee bob = new Employee("Bob", 6000);
        Employee charlie = new Employee("Charlie", 7000);

        Department department = new Department("IT Department");
        department.addEmployee(alice);
        department.addEmployee(bob);
        department.addEmployee(charlie);

        alice.approveVacation();
        bob.approvePromotion();

        Handler manager = new ManagerHandler();
        Handler director = new DirectorHandler();
        Handler ceo = new CEOHandler();


        manager.setNextHandler(director);
        director.setNextHandler(ceo);


        Request vatationRequest = new Request(alice, RequestType.VACATION);
        Request salaryRequest = new Request(charlie, RequestType.SALARY);
        Request promotionRequest = new Request(bob, RequestType.PROMOTION);


        System.out.println(manager.handleRequest(vatationRequest));
        System.out.println(manager.handleRequest(salaryRequest));
        System.out.println(manager.handleRequest(promotionRequest));

        System.out.printf("Department expenses: %d%n", department.getExpenses());
        System.out.printf("Department vacations: %d%n", department.getVacationsCount());
    }
}
