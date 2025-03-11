public class Course {
    //class variable
    private static String instituteName="Chitkara University";

    //instance variables
    final private String courseName;
    final private String duration;
    final private double fees;

    //Parameterized constructor
    public Course(String courseName,String duration,double fees){
        this.courseName= courseName;
        this.duration=duration;
        this.fees=fees;
    }

    //instance method
    public void displayCourseDetails(){
        System.out.println("Institute name: "+ instituteName+ "\tCourse name: "+courseName+"\tCourse duration: "+duration+"\tCourse fees: "+fees);
    }

    //class method
    public static void updateInstituteName(String newInstituteName){
        instituteName=newInstituteName; //modify value of class variable for all the objects of the class
        System.out.println("The new institute now is: "+newInstituteName);
    }

    public static void main(String[] args) {
        Course course1=new Course("MERN Stack","3 months",11000);
        Course course2=new Course("Java Stack","5 months",9000);
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        updateInstituteName("PEC Chandigarh"); //modify institute name for all courses using class method

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}