class Parent{
    void print(){
        System.out.println("This is the parent method.");
    }
}

class Child1 extends Parent{
    void print(){
        System.out.println("This is a child 1 method.");
    }
    void ParentMethod(){

        super.print();
    }
}
class Child2 extends Parent{
    void print(){
        System.out.println("This is a child 2 method.");
    }
    void ParentMethod(){

        super.print();
    }
}
public class heirerchical_inheritance {


    public static void main(String[] args) {
           Child1 obj1=new Child1();
           obj1.print();
           obj1.ParentMethod();
    }
}
