import java.util.Date;

public class Doctor extends Staff {
  private Date dob;
  private int yearsExp;
  private String Qualification;

  public Doctor() {

  }

  public String getQualification() {
    return Qualification;
  }

  public void setQualification(String qualification) {
    Qualification = qualification;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public int getYearsExp() {
    return yearsExp;
  }

  public void setYearsExp(int yearsExp) {
    this.yearsExp = yearsExp;
  }

  public void getFreeTime() {

  }

  public void performTreatment() {

  }

  public void operateScanMachine() {

  }

}
