package GlobalFunctions;

public class User {

    String fName;String lName;String uName;String uPass;String customerType;String role ;String email;String cell;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public User(String fName, String lName, String uName, String uPass, String customerType, String role, String email, String cell) {
        this.fName = fName;
        this.lName = lName;
        this.uName = uName;
        this.uPass = uPass;
        this.customerType = customerType;
        this.role = role;
        this.email = email;
        this.cell = cell;
    }


}
