import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	
		String token1 = " ";
		
		Scanner fileInput = new Scanner(System.in);
		fileInput = new Scanner(new File("src//tree.txt"));
	
		
		ArrayList<String> temps = new ArrayList<String>();

		    // while loop
		    while (fileInput.hasNext()) {
		      // find next line
		      token1 = fileInput.next();
		      temps.add(token1);
		    }
		    fileInput.close();

		    String[] tempsArray = temps.toArray(new String[0]);

		    for (String s : tempsArray) {
		      System.out.println(s);
		    }
		  
		

		System.out.println();
		fileInput.close();
		
	}
	
}


