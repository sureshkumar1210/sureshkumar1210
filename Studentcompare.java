package collection;

import java.util.TreeSet;

public class Studentcompare {

	public static void main(String[] args) {
		StudentsComparator scomp=new StudentsComparator();
		TreeSet<StudentOne> Students=new TreeSet<StudentOne>(scomp);
		StudentOne s=new StudentOne("muthu",44);
		//System.out.println(s);
		Students.add(s);
		Students.add(new StudentOne("suresh",24));
		Students.add(new StudentOne("hari",25));
		Students.add(new StudentOne("akash",27));
		Students.add(new StudentOne("karthi",22));
//		for(StudentOne sk:Students) {
//			sk.ShowStudentDetails();
		}
		System.out.println(Students);
	}

}
