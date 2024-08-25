import java.sql.Date;
import java.sql.Time;

public class Appointment {
  private int a_id;
  private Date date;
  private Time time;
  private Patient patient;
  private Doctor doctor;
  private double regFee;

  public Appointment(int a_id, Date date, Time time, Patient patient, Doctor doctor, double regFee) {
    a_id = this.a_id;
    date = this.date;
    time = this.time;
    patient = this.patient;
    doctor = this.doctor;
    regFee = this.regFee;
  }

  public int getA_id() {
    return a_id;
  }

  public Date getDate() {
    return date;
  }

  public Time getTime() {
    return time;
  }

  public Patient getPatient() {
    return patient;
  }

  public Doctor getDoctor() {
    return doctor;
  }

  public double getRegFee() {
    return regFee;
  }

  public void setA_id(int a_id) {
    this.a_id = a_id;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setTime(Time time) {
    this.time = time;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public void setDoctor(Doctor doctor) {
    this.doctor = doctor;
  }

  public void setRegFee(double regFee) {
    this.regFee = regFee;
  }

  public void addAppoint() {
    // Add appointment code(Save)
  }

  public void displayAppoint(int p_id) {
    // Displaying appointment code(Display)
  }

  public void removeAppoint(int p_id) {
    // Removing appointment code(Delete)
  }

  public void updateAppoint(int p_id) {
    // Updating appointment code(Delete)
  }
}
