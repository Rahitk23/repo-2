package feb04;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> studentslist=new ArrayList<>();
        studentslist.add(new Student("Rahit",34));
        studentslist.add(new Student("Richa",56));
        studentslist.add(new Student("Amita",23));

        System.out.println("Unsorted list: ");
        for (Student student:
             studentslist) {
            System.out.print(student+" ");
        }
        Collections.sort(studentslist,new CompareStudentRollNo());
        System.out.println();
        System.out.println("After list sorted by rollno:");
        for (Student student:
                studentslist) {
            System.out.print(student+" ");
        }
    }
}
