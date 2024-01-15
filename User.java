 class UserInfo {
    private String username ;
    private String email;
    private String password;

    public UserInfo(){

    }
    public UserInfo(String username , String email , String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    public String getUsername(){
        return username;
    }
    public void setUsername()
    {
        this.username = username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail()
    {
        this.email = email;
    }

    public void setPassword()
    {
        this.password = password;
    }

}

class Plan {
    private String planName;
    private double price;
    private int dataLimit;

    // Constructors
    public Plan() {
    }

    public Plan(String planName, double price, int dataLimit) {
        this.planName = planName;
        this.price = price;
        this.dataLimit = dataLimit;
    }

    // Getters and Setters
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDataLimit() {
        return dataLimit;
    }

    public void setDataLimit(int dataLimit) {
        this.dataLimit = dataLimit;
    }
}


class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String position;

    // Constructors
    public Employee() {
    }

    public Employee(String employeeId, String firstName, String lastName, String position) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

public class User{

    public static void main(String[] args) {
        UserInfo u = new UserInfo("Lavish Sharma" , "lavish3113@gmail.com" , "1235d");
        System.out.println(u.getUsername());
        System.out.println(u.getEmail());
        Employee e = new Employee("01" , "mihir" , "jain" , "Dev-ops engineer");
        System.out.println(e.getEmployeeId());
        System.out.println(e.getFirstName());

        Plan p = new Plan("Basic" , 2500 , 3);
        System.out.println(p.getPlanName() + " Plan data limit is " + p.getDataLimit() +" and cost is " + p.getPrice());
    }

}


