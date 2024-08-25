import java.util.ArrayList;
import java.util.List;

public class Employee_FDC {
  private int id;
  private String name, position;
  private double salary;
  private List<Employee_FDC> subordinates = new ArrayList<>();

  public Employee_FDC(int id, String name, String position, double salary) {
    this.id = id;
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

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

  public List<Employee_FDC> getSubordinates() {
    return subordinates;
  }

  public void setSubordinates(List<Employee_FDC> subordinates) {
    this.subordinates = subordinates;
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

}