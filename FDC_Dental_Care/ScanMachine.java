public class ScanMachine {
  private int serialNo;
  private double cost;
  private String make, countryOfOrigin;

  public int getSerialNo() {
    return serialNo;
  }

  public String getMake() {
    return make;
  }

  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public double getCost() {
    return cost;
  }

  public void setSerialNo(int serialNo) {
    this.serialNo = serialNo;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  private static ScanMachine instance = new ScanMachine();

  private ScanMachine() {

  }

  public static ScanMachine getInstance() {
    return instance;
  }

  public void showScanners() {
    com.println(" ");
    com.println("\033[32m\033[1m====SCAN MACHINE DETAILS====\033[0m\033[0m");
    com.println("> Serial number: " + this.serialNo);
    com.println("> Make: " + this.make);
    com.println("> Country: " + this.countryOfOrigin);
    com.println("> Cost: " + this.cost);
    com.println(" ");
  }
}
