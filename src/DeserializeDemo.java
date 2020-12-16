import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class DeserializeDemo {
	public static void main(String[] args) {
		Employee e = null;
		Employee e1 = null;
		try {
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			e1= (Employee)in.readObject();
			in.close();
			fileIn.close();
		} 
		catch (IOException i) {
			i.printStackTrace();
		} 
		catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
		}
	    e.getEmployeeDetails();
	    e1.getEmployeeDetails();
	}
}
