public class run {
  public static void main(String[] args) {

    ScanMachine scan = ScanMachine.getInstance();

    // First Object
    scan.setSerialNo(5343839);
    scan.setMake("Toshiba");
    scan.setCountryOfOrigin("JAPAN");
    scan.setCost(400000.00);

    scan.showScanners();

    Employee director = new Employee(1, "Tooth implant");
    Employee dentist = new Employee(2, "Scaling and Cleaning");
    Employee nurse = new Employee(3, "Antibiotic Treatment");

    director.addSubordinates(nurse);
    director.addSubordinates(dentist);

    director.displayDetail();

    for (Employee scalingAndCleaningObj : director.getSubordinates()) {
      scalingAndCleaningObj.displayDetail();
      for (Employee antibioticTreatmentObj : scalingAndCleaningObj.getSubordinates()) {
        antibioticTreatmentObj.displayDetail();
      }
    }

  }
}
