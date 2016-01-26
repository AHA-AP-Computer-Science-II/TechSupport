package lmtstfy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class CalebTest {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		String protocol = "http://";
		
		System.out.print("URL: ");
		
		String urlString = scan.next();
		
		if (!urlString.startsWith(protocol)) {
			urlString = protocol + urlString;
		}
		
        URL url = new URL(urlString);
        InputStream stream = url.openStream();
        InputStreamReader streamReader = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(streamReader);
        
        String input, text = "";
        while ((input = reader.readLine()) != null) {
        	if (input.contains("<body")) {
        		input = input.substring(input.indexOf("<body"));
            	text += input + "\n";
        	}
        	
        	if (input.contains("</body")) {
        		input = input.substring(0, input.indexOf("</body"));
            	text += input + "\n";
        	}
        	
        }
        
        System.out.println(text);
        
        reader.close();
        
    }
	
}