package throws_construct;

import java.io.*;

public class CentralizedExceptionHandlerApp {
	
	private static BufferedReader reader = null;

	public static void main(String[] args) {
		try {
			CentralizedExceptionHandlerApp app = new CentralizedExceptionHandlerApp();
			app.openDataFile("data.txt");
			app.readData();
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Specified file not found");
		} catch (IOException e) {
			System.out.println("Error closing file");
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format, skipping rest");
		} catch (Exception e) {
			System.out.println("Unknown error: " + e.getMessage());
		}
	}

	void openDataFile(String fileName) throws FileNotFoundException {
		reader = new BufferedReader(new FileReader(fileName));
	}
	
	private void readData() throws IOException, NumberFormatException {
		String str;
		while ((str = reader.readLine()) != null) {
			int n = Integer.parseInt(str);
			System.out.println(n);
		}
	}
}
