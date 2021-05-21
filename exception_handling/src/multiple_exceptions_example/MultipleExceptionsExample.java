package multiple_exceptions_example;

import java.io.*;
import java.net.*;

public class MultipleExceptionsExample {

	public static void main(String[] args) {
		String urlStr = null;
		while (true) {
			try {
				System.out.print("Enter url: ");
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				urlStr = reader.readLine();
				
				// If there's no input, the program simply loops back 
				// and asks the user to reenter the URL.
				if (urlStr.length() == 0) {
					System.out.println("No url specified:");
					continue;
				}
				
				System.out.println("Opening " + urlStr);
				
				// Next, we try to establish a connection to this URL
				// At this time, if the URL is invalid, the program   
				// will generate a MalformedURLException error
				URL url = new URL(urlStr);
				
				reader = new BufferedReader(new InputStreamReader(url.openStream()));
				
				System.out.println(reader.readLine());
				reader.close();
				
			} catch (MalformedURLException e) {
				System.out.println("Invalid URL " + urlStr + ": " + e.getMessage());
			} catch (IOException e) {
				System.out.println("Unable to execute " + urlStr + ": " + e.getMessage());
				e.printStackTrace();
			} catch (Exception e) {	// The most generic handler at the end to account
									// for all remaining unforeseen errors
				System.out.println(e.getMessage());
			}
		}
	}
}
