package feb04;

import java.util.Comparator;

public class CompareStudentName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
