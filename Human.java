/**
 * Created by 1 on 22.02.14.
 */
public abstract class Human {
    protected String name;
    protected int age;
    public Human(String name){
        this.name=name;
    }
    public Human(String name, int age){
        this.name=name;
        this.age=age;
    }
    protected void Show(){
        System.out.println(name+" ");
    }
}
