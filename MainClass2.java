package core.java.collectionsAssignment;

import java.util.HashSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MainClass2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashSet<String> h=new HashSet<String>();
		System.out.println("Enter any 2 products same ");
		
		
		h.add(sc.next());
		h.add(sc.next());
		h.add(sc.next());
		h.add(sc.next());
		h.add(sc.next());
		h.add(sc.next());
		h.add(sc.next());
		h.add(sc.next());
		h.add(sc.next());
		h.add(sc.next());
		System.out.println("List of the products is: "+h);//similar Products entered will not get into the list

	}

}
