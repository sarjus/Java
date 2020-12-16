package com.sjcet.file.programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OddEvenFile {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		try{

			FileReader fin = new FileReader("oddeven.txt");
			BufferedReader br = new BufferedReader(fin);
			String inp = br.readLine();
			int sum =0;
			for(String element: inp.split(" ")){
			System.out.println(element);
			sum = sum + Integer.parseInt(element);
			}
			System.out.println("Sum="+sum);
			fin.close();
			}
			catch(IOException e){
			System.out.println(e.getMessage());
			}
	}

}
