import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AcademicSystem {
	public static ArrayList<Student> students = new ArrayList<Student>();
	private static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		int option = 0;
		
		do {
			System.out.println("1-Register Student\n"
					+ "2-Delete Student\n"
					+ "3-List Students\n"
					+ "4-Register Class\n"
					+ "5-Cancel Class\n"
					+ "6-List all students\n"
					+ "0-Exit\n");
			
			option = read.nextInt();
			
			switch (option) {
			case 1:
				read.nextLine();
				System.out.println("Enter the name:");
				String name4 = read.nextLine();
				
				System.out.println("Enter the registration code:");
				String code = read.nextLine();
				
				System.out.println("Enter the course:");
				String course = read.nextLine();
				
				System.out.println("Enter the semester:");
				int semester = read.nextInt();
				
				System.out.println("Enter the age:");
				int age = read.nextInt();
				
				System.out.println("Enter the limit of classes he can be in:");
				int limit = read.nextInt();
				
				registerStudent(new Student(name4, code, course, semester, age, limit));
				break;
			
			case 2:
				read.nextLine();
				System.out.println("Enter the name of the student: ");
				String name = read.nextLine();
				
				deleteStudentByName(name);
				break;
				
			case 3:
				listStudents();
				break;
				
			case 4:
				read.nextLine();
				System.out.println("Enter the name of the student: ");
				String name1 = read.nextLine();
				
				System.out.println("Enter the class: ");
				String discipline = read.nextLine();
				
				registerClass(name1, discipline);
				break;
				
			case 5:
				read.nextLine();
				System.out.println("Enter the name of the student: ");
				String name2 = read.nextLine();
				
				System.out.println("Enter the class: ");
				String discipline1 = read.nextLine();
				
				cancelClass(name2, discipline1);
				break;
				
			case 6:
				printListOfStudentsWithClasses();
				break;
				
			default:
				break;
			}
			
		} while (option != 0);
	}

	public static void printListOfStudentsWithClasses() {
		String disciplines = "";
		
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
				for (int j = 0; j < student.classesRegistered.length; j++) {
					if (student.classesRegistered[j] != null) {
						disciplines += student.classesRegistered[j] + "  ";
					}
				}
			} 
		
		for(Student student : students) {
			System.out.printf("%s\t:\t%s\n\n", student.name, disciplines);
		}
	}

	public static void cancelClass(String name, String discipline) {
		for(Student student : students) {
			if(Objects.equals(student.name, name)) {
				student.cancelClassRegister(discipline);
			}
		}
	}

	public static void registerClass(String name, String discipline) {
		for(Student student : students) {
			if(Objects.equals(student.name, name)) {
				student.register(discipline);
			}
		}
	}

	public static void deleteStudentByName(String name) {
		int i = 0;
		while (i < students.size()) {
			Student student = students.get(i);
			
			if(Objects.equals(student.name, name)) {
				students.remove(student);
				break;
			}
			i++;
		}
		/*for(Student student : students) {
			if(Objects.equals(student.name, name)) {
				students.remove(student);
			}
		}*/
	}

	public static void listStudents() {
		for(Student student : students) {
			System.out.println(student.print());
		}
	}

	public static void registerStudent(Student student) {
		students.add(student);
		System.out.println("Registration done\n\n");
	}
}
