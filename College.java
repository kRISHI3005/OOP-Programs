import java.util.Scanner;

class College {

    private String collegeName;


    College(String collegeName) {
        this.collegeName = collegeName;
    }


    class Admission {

        private String studentName;
        private String course;

        
        void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course Enrolled: ");
            course = sc.nextLine();
        }
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName);  // Accessing outer class variable
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	System.out.print("Enter College Name: ");
        String cname = sc.nextLine();
        College college = new College(cname);
      
        College.Admission admission = college.new Admission();
        admission.acceptDetails();
        admission.displayDetails();
    }
}