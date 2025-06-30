package codejava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		
		try {
			FileReader f1 = new FileReader("C:\\Users\\bhava\\read.txt");
			BufferedReader br = new BufferedReader(f1);
		
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.print(line);	
			}
			br.close();
		
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
