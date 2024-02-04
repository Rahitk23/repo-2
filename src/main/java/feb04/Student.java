package feb04;

public class Student {
    private String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return this.name+" : "+this.rollno;
    }

}
