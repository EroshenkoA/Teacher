/**
 * Created by 1 on 22.02.14.
 */
public class Main {
    public static void main (String args[]) {
        Group g=new Group();
        Teacher t=new Teacher("Mr.Seaman");
        Student s[]=new Student[2];
        s[0]=new Student("Lisa");
        s[1]=new Student("Bart");
        g.AddStudent(s[0]);
        g.AddStudent(s[1]);
        g.AddTeacher(t);
        t.SetGroup(g);
        t.SetMarks();
        g.ShowAll();
    }
}
