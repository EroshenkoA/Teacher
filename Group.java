import java.util.ArrayList;

/**
 * Created by 1 on 22.02.14.
 */
public class Group {
    private ArrayList students;
    private Teacher teacher;
    private int capacity;
    public Group(){
        students=new ArrayList();
        capacity=0;
    }
    public int GetCapacity(){
        return capacity;
    }
    public void AddStudent(Student s){
        students.add(s);
        capacity++;
    }
    public void AddTeacher(Teacher t){
        teacher=t;
    }
    public Student GetStudent(int i){
        if ((i>=capacity)||(i<0)) {
            System.out.println("wrong number of student");
            return null;
        }
        else{
            return (Student)students.get(i);
        }
    }
    public void ShowAll(){
        if ((teacher==null)||(students==null))System.out.println("wrong number of student");
        else {
             System.out.println("the teacher is ");
             teacher.Show();
             System.out.println("the students are");
             for (int i=0; i<capacity; i++){
                 ((Student)students.get(i)).Show();
             }
        }
}
}