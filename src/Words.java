import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Words {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("words.txt"));
		while (input.hasNext()) {
			String word = input.next();
			allWords.add(word);
		}
		System.out.println("The List: "+allWords);
		System.out.println("display in reverse order");
		// Display the words in the reverse order
		for (int i = allWords.size() -1; i >= 0; i--) {
			System.out.print(allWords.get(i)+" ");
		}
		System.out.print("\n");
		// remove all plural words
		for (int i = 0; i < allWords.size(); i++) {
			String word = allWords.get(i);
			if (word.endsWith("s")) {
				allWords.remove(i);
				i--;
			}
		}
		System.out.println("The List after removal: " + allWords);
		input.close();
	}
}
