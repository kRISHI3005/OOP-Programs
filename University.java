class University
{   
    static int totalStudents;
    static String universityName;

    static 
    {
        universityName = "ABC University";
        totalStudents = 0;
    }

    
    {
        System.out.println("Instance block executed: New student object created");
    }

 
    University() 
    {
        totalStudents++;
    
    }

   
    static int getTotalStudents() 
    {
        return totalStudents;
    }


    public static void main(String[] args) {

        System.out.println("University Name: " + universityName);

        University s1 = new University();
        University s2 = new University();
	University s3 = new University();
	University s4 = new University();

        System.out.println("Total Students: " + University.getTotalStudents());
    }
}