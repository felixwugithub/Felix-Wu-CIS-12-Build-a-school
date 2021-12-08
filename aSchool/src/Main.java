import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        School uHill = new School("University Hill Secondary", 39, 1);
        //3 teachers
        uHill.addTeacher(new Teacher("Alves", "Hermano", "Social Studies", "halves@vsb.bc.ca"));
        uHill.addTeacher(new Teacher("Beaton", "Greg", "Mathematics", "gbeaton@vsb.bc.ca"));
        uHill.addTeacher(new Teacher("Bordon", "Rob", "Social Studies/ELL (Dept. Head)", "rbordon@vsb.bc.ca"));

        //10 students
        uHill.addStudent(new Student("Alec", "Situ", 73));
        uHill.addStudent(new Student("David", "Huang", 69));
        uHill.addStudent(new Student("Felix", "Wu",100));
        uHill.addStudent(new Student("Minjune", "Park",100));
        uHill.addStudent(new Student("Bogu", "Yang", 10));
        uHill.addStudent(new Student("Junsoo", "Kim", 70));
        uHill.addStudent(new Student("David", "Yao", 59));
        uHill.addStudent(new Student("Eric", "Han", 30));
        uHill.addStudent(new Student("Eric", "Wang", 33));
        uHill.addStudent(new Student("Brian", "Ryu", 100));

        //prints them
        uHill.printTeachers();
        uHill.printStudents();


        //expelling alec cuz i know he is index position 0
        uHill.removeStudent(0);
        //expelling david by scanning for his unique student ID
        uHill.removeStudentByID(1);

        //firing Mr.Bordon
        uHill.removeTeacher(2);

        //prints them
        uHill.printTeachers();
        uHill.printStudents();












    }
}
