public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void printAddress(){
        System.out.println("My name is : %s" + name);
    }
}
