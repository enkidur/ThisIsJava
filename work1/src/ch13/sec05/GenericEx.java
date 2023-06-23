package ch13.sec05;

public class GenericEx {

	public static void main(String[] args) {
//		Person person = new Person();
	//	Applicant<Person> applicant = new Applicant(person);
		//Course.registerCourse1(applicant);
		
		HighStudent student = new HighStudent();
		Applicant<HighStudent> applicat2 = new Applicant<HighStudent>(student);
		Course.registerCourse1(applicat2);
		
		Student student2 = new Student();
		Applicant<Student> applicant4 = new Applicant<Student>(student2);
		Course.registerCourse1(applicat2);
		
	}

}
