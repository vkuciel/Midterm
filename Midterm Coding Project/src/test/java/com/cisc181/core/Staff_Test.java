//
package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static ArrayList<Staff> ListOfStaff = new ArrayList<Staff>();
	static Staff StaffA;
	static Staff StaffB;
	static Staff StaffC;
	static Staff StaffD;
	static Staff StaffE;
	static DateFormat DOB;
	static DateFormat hire;

	@BeforeClass
	public static void setup() {
		try {
		StaffA = new Staff("Bob", "Billy", "Bobson", DOB.parse("1966/04/11"), 
				"Address1", "(302)-111-2222", "Bob@yahoo.com", "12:00-1:00", 1, 100000.0, hire.parse("2000/01/09"), eTitle.MR);
		StaffB = new Staff("Olivia", "James", "Jones", DOB.parse("1970/07/01"), 
				"Address2", "(302)-123-3456", "ojones@gmail.com", "3:00-4:30", 2, 110000.0, hire.parse("2001/02/10"), eTitle.MS);
		StaffC = new Staff("Rachel", "Ray", "Thomson", DOB.parse("1980/08/08"), 
				"Address3", "(302)-987-6554", "rthomson@yahoo.com", "1:00-2:00", 3, 120000.0, hire.parse("2010/03/11"), eTitle.MRS);
		StaffD = new Staff("Ethan", "Billy", "Jeffers", DOB.parse("1981/09/09"),
				"Address4", "(302)-456-4545", "ej@gmail.com", "5:00-6:00", 4, 130000.0, hire.parse("2012/04/12"), eTitle.MR);
		StaffE = new Staff("Don", "Lakes", "Djent", DOB.parse("1985/11/10),"),
				"Address5", "(302)-666-6666", "djent@gmail.com", "6:00-9:00", 5, 140000.0, hire.parse("2016/06/06"), eTitle.MR);
		
		ListOfStaff.add(StaffA);
		ListOfStaff.add(StaffB);
		ListOfStaff.add(StaffC);
		ListOfStaff.add(StaffD);
		ListOfStaff.add(StaffE); 
		}
	// Test for Average
	@Test
	public void AverageTest() {
		double total = 0.0;
		for (int i = 0; i<ListOfStaff.size();i++) {
			total += (ListOfStaff.get(i).getSalary() / 5);	

		}
		assertEquals(120000.0, total, 0.1);
		
		}
	// Test for incorrect phone #
	@Test (expected = PersonException.class)
	public void invalidphonetest() throws PersonException {
		try {
			StaffA.setPhone("3021112222");
		} catch	(Exception a) {
			System.out.println("Incorrect phone number");
			a.printStackTrace();
		}
	}
	// Test for incorrect DOB
	@Test (expected = PersonException.class)
	public void invalidDOBtest() throws PersonException {
		DOB = new SimpleDateFormat("yyyy/mm/dd");
	Staff StaffF = new Staff("Jake", "Paul", "Jones", DOB.parse("100/10/10"),
			"Address6", ("(302)-982-3300"), "jjones@aol.com", "2:00-4:00", 6, 90000.0, hire.parse("1999/09/09"), eTitle.MR);	
	System.out.println("Incorrect date of birth");
	}
	
		
		
	}
	
	}	


