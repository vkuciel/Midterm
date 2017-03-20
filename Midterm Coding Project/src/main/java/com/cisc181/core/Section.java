package com.cisc181.core;
import java.util.UUID;

public class Section {

	public static void main(String[] args) {

	}
		private UUID CourseID;
		private UUID SemesterID;
		private UUID SectionID;
		private int RoomID;
		
		public Section(UUID CourseID, UUID SemesterId, int RoomID) {	
			this.CourseID = CourseID;
			this.SemesterID = SemesterID;
			this.SectionID = SectionID;
			this.RoomID = RoomID;
	}

		public UUID getCourseID() {
			return CourseID;
		}

		public void setCourseID(UUID courseID) {
			CourseID = courseID;
		}

		public UUID getSemesterID() {
			return SemesterID;
		}

		public void setSemesterID(UUID semesterID) {
			SemesterID = semesterID;
		}

		public UUID getSectionID() {
			return SectionID;
		}

		public void setSectionID(UUID sectionID) {
			SectionID = sectionID;
		}

		public int getRoomID() {
			return RoomID;
		}

		public void setRoomID(int roomID) {
			RoomID = roomID;
		}
		
		

}
