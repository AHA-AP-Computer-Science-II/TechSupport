package lmtstfy;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.JSONObject;


public class TechSupportModel {

	public static void main(String[]args){
		try {
			JSONDemo("tree");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void JSONDemo(String addr) throws IOException{
			URL url = new URL("https://graph.facebook.com/search?q=java&type=post");
			try (InputStream is = url.openStream()){
				
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
