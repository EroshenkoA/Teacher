/**
 * Created by 1 on 22.02.14.
 */
public class Student extends Human {
    //private Teacher teacher;
    private int mark;
    public Student(String name, int age){
        super(name,age);
        mark=0;
        }
    public Student(String name){
        super(name);
        mark=0;
    }
    /*public void SetTeacher(Teacher teacher){
        this.teacher=teacher;
    }*/
    public void SetMark(int m){//I'd like to forbid access for anyone except teacher, but I don't know how
        if ((0<m)&&(m<11)){
            mark=m;
        }else{
            System.out.println("wrong mark");
        }
    }
    public void Show(){
        super.Show();
        System.out.println("mark is "+mark);
    }
}
