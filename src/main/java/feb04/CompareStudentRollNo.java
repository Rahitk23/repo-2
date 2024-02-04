package feb04;

import java.util.Comparator;

public class CompareStudentRollNo implements Comparator<Student> {

    @Override
    public int compare(Student a,Student b) {
        return a.getRollno()- b.getRollno();
    }

}
