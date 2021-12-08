import java.util.ArrayList;

public class School {


    //instance variables
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private String schoolName;
    private int district;
    private int ranking;


    //constructors
    public School(){
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
        schoolName = "";
        district = 0;
        ranking = 0;
    }
    public School(String schoolName, int district, int ranking){
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
        this.schoolName = schoolName;
        this.district = district;
        this.ranking = ranking;
    }
    public School(String schoolName, int district, int ranking, ArrayList<Student> students, ArrayList<Teacher> teachers){
        this.students = students;
        teachers = new ArrayList<Teacher>();
        this.schoolName = schoolName;
        this.district = district;
        this.ranking = ranking;

    }

    //get methods
    public String getSchoolName(){return schoolName;}
    public int getDistrict(){return district;}
    public int getRanking(){return ranking;}
    public ArrayList<Student> getStudents(){return students;}
    public ArrayList<Teacher> getTeachers(){return teachers;}
    public Teacher getTeacher(int index){return teachers.get(index);}
    public Student getStudent(int index){return students.get(index);}


    //set methods
    public void setSchoolName(String newSchoolName){schoolName = newSchoolName;}
    public void setDistrict(int newDistrict){district = newDistrict;}
    public void setRanking(int newRanking){ranking = newRanking;}
    public void setStudents(ArrayList<Student> newStudents){students = newStudents;}
    public void setTeachers(ArrayList<Teacher> newTeachers){teachers = newTeachers;}
    public void addTeacher(Teacher newTeacher){teachers.add(newTeacher);}
    public void addStudent(Student newStudent){students.add(newStudent);}
    public void removeTeacher(int index){teachers.remove(index);}
    public void removeStudent(int index){students.remove(index);}
    public void removeStudentByID(int ID){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == ID){
                students.remove(i);
            }
        }
    }
    
    
    public void printTeachers(){
        System.out.println("Teachers:");
        for (Teacher teacher: teachers) {
            System.out.println(teacher.getLastname() + ", " + teacher.getFirstname()+ " -- Subject: " + teacher.getSubject() + " -- Email: " + teacher.getEmail());
        }
    }

    public void printStudents(){
        System.out.println("Students");
        for (Student student: students) {
            System.out.println("ID: " + student.getStudentID() + " -- " + student.getLastname() + ", " + student.getFirstname() + " -- Grade: " + student.getGradeBookAverage());
        }
    }


    



}
