import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Employee implements java.io.Serializable {
   public String name;
   public String address;
   public  int SSN;//This value will not be copied
   public transient int extentionNumber;
   Employee(String name, String address, int SSN, int extentionNumber ){
	   this.name = name;
	   this.address = address;
	   this.SSN = SSN;
	   this.extentionNumber = extentionNumber;
   }
   public void getEmployeeDetails() {
	   System.out.println("Deserialized Employee...");
	   System.out.println("Name: " + name);
	   System.out.println("Address: " + address);
	   System.out.println("SSN: " + SSN);
	   System.out.println("Number: " + extentionNumber);
   }
}
public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee("Joe", "House No:13, Pala, Kottayam",546178,110);
		Employee e1 = new Employee("Sarju", "SJCET", 12458, 312);
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.writeObject(e1);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in employee.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}
}
