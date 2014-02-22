/**
 * Created by 1 on 22.02.14.
 */
public class Teacher extends Human {
    private Group group;
    public Teacher(String name, int age){
        super(name,age);
        group=null;
    }
    public Teacher(String name){
        super(name);
        group=null;
    }
    public void SetGroup(Group group){
        this.group=group;
    }
    private void SetMark(Student s){
        if (s==null) System.out.println("student is null");
        else
        s.SetMark((int) Math.round(10*Math.random()));
    }
    public void SetMarks(){
        int max=group.GetCapacity();
        for (int i=0; i<max; i++){
            SetMark(group.GetStudent(i));
        }
    }
    public void Show(){
        super.Show();
        //System.out.println("\n");
    }
}
