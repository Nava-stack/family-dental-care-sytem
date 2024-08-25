import java.sql.Date;

public class Payment {
  private int payId;
  private Date date;
  private Patient patient;
  private double amount;
  private String payMethod;

  public Payment(int payId, Date date, Patient patient, double amount, String payMethod) {
    payId = this.payId;
    date = this.date;
    patient = this.patient;
    amount = this.amount;
    payMethod = this.payMethod;
  }

  public int getPayId() {
    return payId;
  }

  public Date getDate() {
    return date;
  }

  public Patient getPatient() {
    return patient;
  }

  public double getAmount() {
    return amount;
  }

  public String getPayMethod() {
    return payMethod;
  }

  public void setPayId(int payId) {
    this.payId = payId;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setPayMethod(String payMethod) {
    this.payMethod = payMethod;
  }

  public void addPay() {
    try {

    } catch (Exception e) {
      // Registering code(Save)
    } finally {

    }
  }

  public void displayPay() {
    try {

    } catch (Exception e) {
      // Displaying code(Display)
    } finally {

    }
  }

  public void removePay() {
    try {

    } catch (Exception e) {
      // Removing code(Delete)
    } finally {

    }
  }

  public void updatePay() {
    try {

    } catch (Exception e) {
      // Updating code(Delete)
    } finally {

    }
  }
}
