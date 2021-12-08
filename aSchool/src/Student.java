public class Student {


    //instance variables
    private static int currentStudentNum = 0;
    private String firstname;
    private String lastname;
    private int gradeBookAverage;
    private int studentID;

    //Student class constructors
    public Student(){
        firstname = "";
        lastname = "";
        gradeBookAverage = 0;
        studentID = currentStudentNum;
        currentStudentNum++;
    }
    public Student(String firstname, String lastname, int gradeBookAverage){
        this.firstname = firstname;
        this.lastname = lastname;
        this.gradeBookAverage = gradeBookAverage;
        studentID = currentStudentNum;
        currentStudentNum++;
    }



    //get methods
    public String getFirstname(){return firstname;}
    public String getLastname(){return lastname;}
    public int getGradeBookAverage(){return gradeBookAverage;}
    public int getStudentID(){return  studentID;}



    //set methods
    public void setFirstname(String newFirstname){firstname = newFirstname;}
    public void setLastname(String newLastname){lastname = newLastname;}
    public void setGradeBookAverage(int newGradeBookAverage){gradeBookAverage = newGradeBookAverage;}



}
