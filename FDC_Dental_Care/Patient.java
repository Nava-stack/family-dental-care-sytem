/**
 * patient
 */
public class Patient {
  private int p_id;
  private String name;
  private String nicNo;
  private int mobile;
  private String address;

  public Patient(int p_id, String name, String nicNo, int mobile, String address) {
    p_id = this.p_id;
    name = this.name;
    nicNo = this.nicNo;
    mobile = this.mobile;
    address = this.address;
  }

  public int getP_id() {
    return p_id;
  }

  public String getName() {
    return name;
  }

  public String getNicNo() {
    return nicNo;
  }

  public int getMobile() {
    return mobile;
  }

  public String getAddress() {
    return address;
  }

  public void setP_id(int p_id) {
    this.p_id = p_id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNicNo(String nicNo) {
    this.nicNo = nicNo;
  }

  public void setMobile(int mobile) {
    this.mobile = mobile;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void registerPatient() {
    try {

    } catch (Exception e) {
      // Registering patient code(Save)
    } finally {

    }
  }

  public void displayPatient() {
    try {

    } catch (Exception e) {
      // Displaying patient code(Display)
    } finally {

    }
  }

  public void removePatient() {
    try {

    } catch (Exception e) {
      // Removing patient code(Delete)
    } finally {

    }
  }

  public void updatePatient() {
    try {

    } catch (Exception e) {
      // Updating patient code(Update)
    } finally {

    }
  }

}