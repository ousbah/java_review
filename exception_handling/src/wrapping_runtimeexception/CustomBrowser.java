package wrapping_runtimeexception;

import java.io.*;
import java.net.*;

public class CustomBrowser {

	public static void main(String[] args) {
		HtmlWebBrowser app = new HtmlWebBrowser();
		try {
			app.makeConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Coucou, I'm in caller!!!");
			e.printStackTrace();
		}
	}
}

class WebBrowser {
	// This method doesn't process or throw an exception up the hierarchy. 
	// However, if a superclass method throws no exceptions, neither can the 
	// subclass method.To overcome this problem, see the catch block at the 
	// bottom of the while
	public void makeConnection() {
	}
}

class HtmlWebBrowser extends WebBrowser {
	// This overridden method is not allowed to throw a checked exception
	public void makeConnection() throws RuntimeException {
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
		
				URL url = new URL(urlStr);
				
				reader = new BufferedReader(new InputStreamReader(url.openStream()));
				
				System.out.println(reader.readLine());
				reader.close();
			} catch (Exception e) {
				// Creates an object of RuntimeException in this overridden method...
				RuntimeException ae = new RuntimeException("Invalid url " + urlStr + 
															": " + e.getMessage() + ".");
				ae.initCause(e); // ...wraps the generated exception in it, 
				throw ae; // ...and throws it up the hierarchy
			}
		}
	}
}
