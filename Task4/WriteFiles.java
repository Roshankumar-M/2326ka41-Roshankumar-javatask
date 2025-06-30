package codejava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
	public static void main(String[] args) {
		String fileName = "output.txt";
		String[] lines = { "Hello, this is line 1.", "This is line 2.", "End of file." };

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			for (String line : lines) {
				writer.write(line);
				writer.newLine();
			}

			System.out.println("File written successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}
}