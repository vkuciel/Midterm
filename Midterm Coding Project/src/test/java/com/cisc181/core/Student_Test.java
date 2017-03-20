package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

// 10 students, 3 courses, 2 semesters, 2 sections

public class Student_Test {
	private static ArrayList<Course> ListOfCourse = new ArrayList<Course>();
	private static Course CourseA;
	private static Course CourseB;
	private static Course CourseC;
	private static ArrayList<Semester> ListOfSemester = new ArrayList<Semester>();
	private static Semester Fall;
	private static Semester Spring;
	private static ArrayList<Section> ListOfSection = new ArrayList<Section>();
	private static Section SectionACourseFall1;
	private static Section SectionBCourseSpring1;
	private static Section SectionACourseFall2;
	private static Section SectionBCourseSpring2;
	private static Section SectionACourseFall3;
	private static Section SectionBCourseSpring3;
	private static ArrayList<Student> ListOfStudent = new ArrayList<Student>();
	private static Student StudentA;
	private static Student StudentB;
	private static Student StudentC;
	private static Student StudentD;
	private static Student StudentE;
	private static Student StudentF;
	private static Student StudentG;
	private static Student StudentH;
	private static Student StudentI;
	private static Student StudentJ;
	private static ArrayList<Enrollment> ListOfEnrollment = new ArrayList<Enrollment>();
	

	@BeforeClass
	public static void setup() throws PersonException{
		CourseA = new Course("NURSING",1, eMajor.NURSING);
		CourseB = new Course("PHYSICS", 2, eMajor.PHYSICS);
		CourseC = new Course("CHEM", 3, eMajor.CHEM);
		ListOfCourse.add(CourseA);
		ListOfCourse.add(CourseB);
		ListOfCourse.add(CourseC);
		
		Fall = new Semester(new Date(), new Date());
		Spring = new Semester(new Date(), new Date());
		ListOfSemester.add(Fall);
		ListOfSemester.add(Spring);
		
		Section SectionACourseAFall = new Section(CourseA.getCourseID(), Fall.getSemesterID(), 100);
		Section SectionBCourseAFall = new Section(CourseA.getCourseID(), Spring.getSemesterID(), 200);
		Section SectionACourseBFall = new Section(CourseB.getCourseID(), Fall.getSemesterID(), 300);
		Section SectionBCourseBFall = new Section(CourseB.getCourseID(), Spring.getSemesterID(), 400);
		Section SectionACourseCFall = new Section(CourseC.getCourseID(), Fall.getSemesterID(), 500);
		Section SectionBCourseCFall = new Section(CourseC.getCourseID(), Spring.getSemesterID(), 600);
		ListOfSection.add(SectionACourseAFall);
		ListOfSection.add(SectionBCourseAFall);
		ListOfSection.add(SectionACourseBFall);
		ListOfSection.add(SectionBCourseBFall);
		ListOfSection.add(SectionACourseCFall);
		ListOfSection.add(SectionBCourseCFall);
		
		StudentA = new Student("Bob1", "MI", "LN", new Date(), "BUSINESS", "Address1", ("(302)-111-1111"), "Bob@gmail.com");
		StudentB = new Student("Bob2", "MI", "LN", new Date(), "BUSINESS", "Address2", ("(302)-222-2222"), "Bob2@gmail.com");
		StudentC = new Student("Bob3", "MI", "LN", new Date(), "BUSINESS", "Address3", ("(302)-333-3333"), "Bob3@gmail.com");
		StudentD = new Student("Bob4", "MI", "LN", new Date(), "BUSINESS", "Address4", ("(302)-444-4444"), "Bob4@gmail.com");
		StudentE = new Student("Bob5", "MI", "LN", new Date(), "BUSINESS", "Address5", ("(302)-555-5555"), "Bob5@gmail.com");
		StudentF = new Student("Bob6", "MI", "LN", new Date(), "BUSINESS", "Address6", ("(302)-666-6666"), "Bob6@gmail.com");
		StudentG = new Student("Bob7", "MI", "LN", new Date(), "BUSINESS", "Address7", ("(302)-777-7777"), "Bob7@gmail.com");
		StudentH = new Student("Bob8", "MI", "LN", new Date(), "BUSINESS", "Address8", ("(302)-888-8888"), "Bob8@gmail.com");
		StudentI = new Student("Bob9", "MI", "LN", new Date(), "BUSINESS", "Address9", ("(302)-999-9999"), "Bob9@gmail.com");
		StudentJ = new Student("Bob10", "MI", "LN", new Date(), "BUSINESS", "Address10", ("(302)-101-1010"), "Bob10@gmail.com");
		ListOfStudent.add(StudentA);
		ListOfStudent.add(StudentB);
		ListOfStudent.add(StudentC);
		ListOfStudent.add(StudentD);
		ListOfStudent.add(StudentE);
		ListOfStudent.add(StudentF);
		ListOfStudent.add(StudentG);
		ListOfStudent.add(StudentH);
		ListOfStudent.add(StudentI);
		ListOfStudent.add(StudentJ);
	}
// GPA TEST
	@Test
	public void testGPA() {
		for (int i=0; i < ListOfStudent.size(); i++) {
			double GPA = 0;
			for (int j=i; j < ListOfEnrollment.size(); j = j + ListOfStudent.size()) {
				GPA += ListOfEnrollment.get(j).getGrade();
				
			}
			assertEquals((int)GPA/ListOfSection.size(), 90);
		}
	}
	// AVERAGE TEST
	public void testAVG() {
		for (int i=0; i < ListOfSection.size(); i++) {
			double AVG = 0;
			for (int j=i; j < ListOfEnrollment.size(); j = j + ListOfStudent.size()) {
				AVG += ListOfEnrollment.get(j).getGrade();
				
			}
			assertEquals((int)AVG/ListOfSection.size(), 100);
		}
	}
	// Major change
	public void testChangeMajor() {
		Date DOB = new Date();
		Student StudentA = Student("Bob1", "MI", "LN", new Date(), "BUSINESS", "Address1", ("(302)-111-1111"), "Bob@gmail.com");
		StudentA.setMajor(eMajor.NURSING);
		assertEquals(StudentA.getMajor(), eMajor.NURSING);
		
		
	}
}
