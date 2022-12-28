package collection;

public class StudentOne {
		String name;
		int rollno;
		public StudentOne(String name,int rollno) {
			this.name=name;
			this.rollno=rollno;
		}
		public void ShowStudentDetails() {
			System.out.println("name:"+name+" "+"rollno:"+rollno);
		}
		@Override
		public String toString() {
			return "name:"+name+" "+"rollno:"+rollno;
		}

	}
