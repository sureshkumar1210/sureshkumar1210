package collection;

import java.util.Comparator;

public class StudentsComparator implements Comparator<StudentOne> {

	@Override
	public int compare(StudentOne stu1, StudentOne stu2) {
		//string ascending comparision
//		int result = stu1.name.compareTo(stu2.name);
//		return result;
		
		if (stu1.rollno > stu2.rollno) {
			return 1;
		} else if (stu1.rollno < stu2.rollno) {
			return -1;
		} else {
			return 0;
		}
	}

}
