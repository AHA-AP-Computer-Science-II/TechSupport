package lmtstfy;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.JSONObject;


public class TechSupportModel {

	public static void main(String[]args){
	}
	public static void JSONDemo(String addr) throws IOException{
		// build a URL
	    String s = "http://maps.google.com/maps/api/geocode/json?" +
	                    "sensor=false&address=";
	    s += URLEncoder.encode(addr, "UTF-8");
	    URL url = new URL(s);

	    // read from the URL
	    Scanner scan = new Scanner(url.openStream());
	    String str = new String();
	    while (scan.hasNext())
	        str += scan.nextLine();
	    scan.close();

	    // build a JSON object
	    JSONObject obj = new JSONObject(str);
	    if (! obj.getString("status").equals("OK"))
	        return;

	    // get the first result
	    JSONObject res = obj.getJSONArray("results").getJSONObject(0);
	    System.out.println(res.getString("formatted_address"));
	    JSONObject loc =
	        res.getJSONObject("geometry").getJSONObject("location");
	    System.out.println("lat: " + loc.getDouble("lat") +
	                        ", lng: " + loc.getDouble("lng"));
		}
	}
