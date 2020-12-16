import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OddEvenFile {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		try{

			FileReader fin = new FileReader("oddeven.txt");
			BufferedReader br = new BufferedReader(fin);
			FileWriter odd = new FileWriter("odd.txt");
			FileWriter even = new FileWriter("even.txt");
			int number;
			String inp = br.readLine();
			for(String element: inp.split(" ")){
				//System.out.println(element);
				number = Integer.parseInt(element);
				if(number%2==0){
					even.write(element+" ");
				}
				else {
					odd.write(element+" ");
				}
			}
			odd.close();
			even.close();
			fin.close();
			}
			catch(IOException e){
			System.out.println(e.getMessage());
			}
	}
}