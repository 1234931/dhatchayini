package assignment4;

public class Students {
	/*class : students
	methods : getstudentinfo()
	description:
	create multiple getstudentinfo() ,method by passing id argument alone, by id name,by email & phone number.
	*/

	public void getstudentinfo(int id) {
		System.out.println("student id is"+" "+id);
	}

	public void getstudentinfo(int id, String name) {
		System.out.println("student id is"+" " +id+ ", "+ "student name is"+" "+name);

	}

	public void getstudentinfo(String mail, long phone) {
		System.out.println("student mail is"+" "+mail+", "+"student phone number is"+" "+phone);

	}

	public static void main(String[] args) {
		Students details = new Students();
		details.getstudentinfo(128);
		details.getstudentinfo(128, "dhatch");
		details.getstudentinfo("yuganthika@gmail.com", 9994858338L);
	}

}
	

