import java.util.*;
import java.util.regex.*;

// [C]{1}\d{5} custId
// [A-Za-z]{3}([A-Za-z]+ ?)*  custName
// ^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$ emailId

class Customer{
    private String custName,address,emailId;
    private String custId;
    public void setCustName(String custName) {
        this.custName = custName;
      }
    public String getCustName() {
        return custName;
    }
    public void setCustId(String custId) {
        this.custId = custId;
    }
    public String getCustId() {
        return custId;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getEmailId() {
        return emailId;
    }

}

public class CustomerMain {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String custId=sc.next();
    // String custName=" ";
    String custName=sc.next();
    // String address=" ";
    String address=sc.next();
    String emailId=sc.next();
    Customer c1=new Customer();
    if (Pattern.matches("[C]{1}\\d{5}", custId)) {
        c1.setCustId(custId);
        System.out.println(c1.getCustId());
        
    } else {
        System.out.println("Invalid customer id");
    }
    if (Pattern.matches("[A-Za-z]{3}([A-Za-z]+ ?)*", custName)) {
        c1.setCustName(custName);
        System.out.println(c1.getCustName());
        
    } else {
        System.out.println("Invalid customer name");
    }
    if (Pattern.matches("^(.+)@(\\S+)$", emailId)) {
        c1.setEmailId(emailId);
        System.out.println(c1.getEmailId());
        
    } else {
        System.out.println("Invalid email id");
    }
    c1.setAddress(address);
    System.out.println(c1.getAddress());
}
    
}