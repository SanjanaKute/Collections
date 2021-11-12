package core.java.collectionsAssignment;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import core.java.collectionsAssignment.Contact.Gender;

class Contact implements Comparable<Contact>
{
	private Long number;
	private String name;
	private String email;
	private Gender gender;
	
	enum Gender
	{
		Female,
		male
	}
	
	public Contact( String name, String email, Gender gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public Gender getGender() {
		return gender;
	}
	public Long getNumber()
	{
		return number;
	}


	@Override
	public int compareTo(Contact c) 
	{
		return c.getNumber().compareTo(this.getNumber());
	}

	@Override
	public String toString() {
		return "Contact [ name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
}
public class MainClass1 
{

	public static void main(String[] args)
	{
		Contact c1=new Contact("Bob", "Bob@gmail.com",Gender.male);
		Contact c2=new Contact("Alex", "Alex@gmail.com",Gender.Female);
		Contact c3=new Contact("Garry", "Garry@gmail.com",Gender.male);
		Contact c4=new Contact("Silver", "Silver@gmail.com",Gender.Female);
		Contact c5=new Contact("Jerry", "Jerry@gmail.com",Gender.male);
		
		TreeMap<Long,Contact>t=new TreeMap<Long, Contact>();
		t.put(98989899l, c1);
		t.put(12345623l, c2);
		t.put(67567453l, c3);
		t.put(12875364l, c4);
		t.put(63742802l, c5);
		
		Set<Map.Entry<Long, Contact> > entrySet = t.entrySet();
		for(Map.Entry<Long,Contact> entry:entrySet)
		{
			System.out.println("Keys are: "+entry.getKey());
			//System.out.println("Values are: "+entry.getValue());
			//System.out.println("pairs are: "+entry.getKey() +entry.getValue());
		}
		System.out.println("________________________________________________________________________");
		for(Map.Entry<Long,Contact> entry:entrySet)
		{
			System.out.println("Values are: "+entry.getValue());
		}
		System.out.println("________________________________________________________________________");

		for(Map.Entry<Long,Contact> entry:entrySet)
		{
			System.out.println("Pairs are: "+entry.getKey()+ " "+entry.getValue());
		}
		
	}

}
