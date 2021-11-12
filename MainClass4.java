package core.java.collectionsAssignment;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class MainClass4
{
	public static void main(String[] args) 
	{

				List<LocalDate> l1=new LinkedList<>();
				l1.add(LocalDate.of(2000,Month.JANUARY,8));
				l1.add(LocalDate.of(1978,Month.FEBRUARY,14));
				l1.add(LocalDate.of(1999,Month.MARCH,17));
				l1.add(LocalDate.of(2000,Month.JANUARY,22));
				l1.add(LocalDate.of(1998,Month.MAY,21));
				l1.add(LocalDate.of(2012,Month.DECEMBER,25));
				l1.add(LocalDate.of(1978,Month.JULY,29));
				l1.add(LocalDate.of(2008,Month.AUGUST,22));
				l1.add(LocalDate.of(1971,Month.SEPTEMBER,20));
				l1.add(LocalDate.of(2002,Month.OCTOBER,28));
				
				for(LocalDate ld: l1)
				{
					if(ld.isLeapYear())
					{
						System.out.println("Your date of birth is  "+ld+"  and it was leap year");
					}
					else
					{
						System.out.println("Your date of birth is "+ld+" and it was not leap year");
					}
				}
			}

		}

