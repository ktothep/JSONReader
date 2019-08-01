import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class test {
public static void main(String args[]) throws IOException, ParseException
{
	System.out.println("Parsing the object");
	JSONParser parser=new JSONParser();
	FileReader fr=new FileReader(new File(System.getProperty("user.dir")+"//example_2.json"));
	Object obj=  parser.parse(fr);
	JSONObject json=(JSONObject) obj;
	System.out.println(json);
	Object q= json.get("quiz");
	 JSONObject qui=(JSONObject)q  ;
	 
	 Object mahts=qui.get("maths");
	 JSONObject maths=(JSONObject)mahts;
	 
	 Object q1=maths.get("q1");
	 JSONObject q11=(JSONObject)q1;
	 String question=(String) q11.get("question");
	 System.out.println(question);
	 
	 System.out.println(q11.get("options"));
	 JSONArray arr=(JSONArray) q11.get("options");
	 Iterator itr=arr.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 


	
	
	
}
}
