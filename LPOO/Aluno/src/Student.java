import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Class that represents a student.
 * 
 * @author Thiago Cezario
 *
 */
public class Student {
	String name;
	String registrationCode;
	String course;
	String[] classesRegistered;
	String address;
	int semester;
	int age;
	
	/**
	 * Constructor for the student, initializing the 
	 * class with chosen values
	 * 
	 * @param name  the name of the student
	 * @param registrationCode    the number of registration of the student
	 * @param course	the course the student is attending to
	 * @param semester	the semester the student is in
	 * @param age	the student's age
	 * @param maxClassesAllowed		the maximum number of classes that the student can be registered simultaneously
	 */
	public Student(String name, 
			String registrationCode, 
			String course,
			int age,
			int semester, 
			int maxClassesAllowed) {
		
		this.name = name;
		this.registrationCode = registrationCode;
		this.course = course;
		this.semester = semester;
		this.age = age;
		this.classesRegistered = new String[maxClassesAllowed];
	}
	
	/**
	 * Register a class for the student
	 * @param discipline	The class to be registered
	 * @return Whether the registration failed or not
	 */
	public String register(String discipline) {
		String result = "";
		
		if (this.classesRegistered.length == 0) {
			result = "This student can't be registered on any class";
		
		} else {			
			for(int i = 0; i < this.classesRegistered.length; i++) {
				if (this.classesRegistered[i] == discipline) {
					result = "Class already registered";
					break;
				}
				else if (this.classesRegistered[i] == null || this.classesRegistered[i].isEmpty()) {
					this.classesRegistered[i] = discipline;
					result = String.format("Class %s added successfully", discipline);
					break;
				
				} else {
					result = String.format("Maximum of %d classes reached", this.classesRegistered.length);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Cancels the registration of a determined class
	 * @param discipline	Class to be cancelled
	 * @return Whether it failed or not
	 */
	public String cancelClassRegister(String discipline) {
		String result = "";
		
		for (int i = 0; i < this.classesRegistered.length; i++) {
			if (Objects.equals(this.classesRegistered[i], discipline)) {
				List<String> list = new ArrayList<String>(Arrays.asList(this.classesRegistered));
				list.removeAll(Arrays.asList(discipline));
				this.classesRegistered = list.toArray(this.classesRegistered);
				
				result = "Class removed successfully";
				break;
				
			} else {
				result = "Class not registered";
			}
			
		}
		
		return result;
	}
	
	/**
	 * Formats the informations about the student
	 * @return the student's information formated
	 */
	public String print() {
		String result = "";
		String disciplines = "";
		
		for (int i = 0; i < this.classesRegistered.length; i++) {
			if (i+1 == this.classesRegistered.length && this.classesRegistered[i] != null) {
				disciplines += this.classesRegistered[i];
				
			} else if (this.classesRegistered[i] != null){
				disciplines += this.classesRegistered[i] + ", ";
			}
		}
		
		result = String.format(
				"---------------------------"
				+ "--------------------------"
				+ "------------\nStudent's Name: "
				+ "%s\nRegistration: %s\nCourse: "
				+ "%s\nSemester: %d\nClasses Registered: "
				+ "%s\n----------------------------"
				+ "-------------------------------"
				+ "------", this.name, this.registrationCode,
				this.course, this.semester, disciplines);
		
		return result;
	}
}
