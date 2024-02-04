package feb04;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> studentslist = new ArrayList<>();
        studentslist.add(new Student("Rahit", 34));
        studentslist.add(new Student("Richa", 56));
        studentslist.add(new Student("Zen", 23));

        studentslist.add(new Student("Amita", 23));

        System.out.println("Unsorted list: ");
        System.out.println(studentslist);

        Collections.sort(studentslist, new CompareStudentRollNo());
        System.out.println();
        System.out.println("After list sorted by rollno:");
        System.out.println(studentslist);

        Collections.sort(studentslist, new CompareStudentName());
        System.out.println();
        System.out.println("After list sorted by name:");
        System.out.println(studentslist);
   }
}
