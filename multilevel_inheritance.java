class Parent{
    public void Print(){
        System.out.println("This is the parent class method!");
    }
}
class child1 extends Parent{
    public void Print(){
        System.out.println("This is the Child 1 Method!");
    }
    {
    super.Print();
    }
}
class child2 extends child1{
    public void Print(){
        System.out.println("This is the Child 2 Method!");
    }
    {
    super.Print();
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        child2 obj1=new child2();
        obj1.Print();
    }
}
