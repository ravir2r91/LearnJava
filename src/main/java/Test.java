import java.io.*;

public class Test {
    public static void main(String [] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C://Project_Repos/LearnJava/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
            FileInputStream fileIn = new FileInputStream("C://Project_Repos/LearnJava/employee.ser");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            Employee e1 = (Employee) objIn.readObject();
            objIn.close();
            fileIn.close();
            System.out.println("Name : " + e1.name);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
