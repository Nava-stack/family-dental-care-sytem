import java.util.ArrayList;
import java.util.List;

public class composite {
  public static void main(String[] args) {
    Employee_FDC director = new Employee_FDC(1, "Dr. Anton", "Director", 1000000.00);
    Employee_FDC dentist1 = new Employee_FDC(2, "Dr. Chamod", "Dentist", 600000.00);
    Employee_FDC dentist2 = new Employee_FDC(3, "Dr. Supuni", "Dentist", 600000.00);
    Employee_FDC dentist3 = new Employee_FDC(4, "Dr. Madhavi", "Dentist", 600000.00);
    Employee_FDC nurse1 = new Employee_FDC(5, "Nurse Piyal", "Nurse", 200000.00);
    Employee_FDC nurse2 = new Employee_FDC(6, "Nurse Kamal", "Nurse", 200000.00);
    Employee_FDC nurse3 = new Employee_FDC(7, "Nurse Kapila", "Nurse", 200000.00);

    List<Employee_FDC> subordinatesDentists = new ArrayList<>();
    subordinatesDentists.add(dentist1);
    subordinatesDentists.add(dentist2);
    subordinatesDentists.add(dentist3);

    List<Employee_FDC> subordinatesNurses = new ArrayList<>();
    subordinatesNurses.add(nurse1);
    subordinatesNurses.add(nurse2);
    subordinatesNurses.add(nurse3);

    director.setSubordinates(subordinatesDentists);
    dentist1.setSubordinates(subordinatesNurses);
    dentist2.setSubordinates(subordinatesNurses);
    dentist3.setSubordinates(subordinatesNurses);

    displayEmployee_FDCDetails(director);
    displayEmployee_FDCDetails(dentist1);
    displayEmployee_FDCDetails(dentist2);
    displayEmployee_FDCDetails(dentist3);
  }

  public static void displayEmployee_FDCDetails(Employee_FDC Employee) {
    com.println("\033[32m\033[1m============ EMPLOYEE LISTS ============\033[0m\033[0m");
    com.println("> Employee ID: " + Employee.getId());
    com.println("> Name: " + Employee.getName());
    com.println("> Position: " + Employee.getPosition());
    com.println("> Salary: " + Employee.getSalary());
    com.println("\033[32m\033[1m----------------------------------\033[0m\033[0m");

    for (Employee_FDC subordinate : Employee.getSubordinates()) {
      com.println("  >>> Subordinate ID: " + subordinate.getId());
      com.println("  >>> Name: " + subordinate.getName());
      com.println("  >>> Position: " + subordinate.getPosition());
      com.println("  >>> Salary: " + subordinate.getSalary());
      com.println("\033[32m\033[1m----------------------------------\033[0m\033[0m");
    }
  }

}