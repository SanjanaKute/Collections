package core.java.collectionsAssignment;

import java.util.Map.Entry;
import java.util.TreeMap;

public class MainClass11
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t=new TreeMap<Integer, String>();
		t.put(123456, "Alex");
		t.put(1343456, "John");
		t.put(335456, "Garry");
		t.put(679456, "Alexa");
		
		for(Entry<Integer, String> entry:t.entrySet())
		{
			System.out.println("Key:"+entry.getKey());
		}
		System.out.println("-------------------");
		for(Entry<Integer, String> entry:t.entrySet())
		{
			System.out.println("Values are:"+entry.getValue());
		}
		System.out.println("-------------------");

		System.out.println("All the key value pairs are: "+t);
		
	}
		
		
}


