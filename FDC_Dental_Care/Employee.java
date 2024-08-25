import java.util.ArrayList;
import java.util.List;

public class Employee {
  private int id;
  private String name, position;
  private double salary;
  private List<Employee> Subordinates;

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public double getSalary() {
    return salary;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public List<Employee> getSubordinates() {
    return Subordinates;
  }

  public void setSubordinates(List<Employee> subordinates) {
    Subordinates = subordinates;
  }

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
    this.Subordinates = new ArrayList<Employee>();
  }

  public void addSubordinates(Employee _treatment) {
    Subordinates.add(_treatment);
  }

  public void removeSubordinates(Employee _treatment) {
    Subordinates.remove(_treatment);
  }

  public void displayDetail() {
    com.println("Employee ID: " + this.id + "Name: " + this.name);
  }

}
