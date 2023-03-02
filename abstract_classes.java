public class abstract_classes{
    abstract static class Parent{
        abstract void count();
        public void display(){
            System.out.println("This is the parent class display method!");
        }
        public void salary(){
            System.out.println("This is the salary method of the parent class!");
        }
    }
    
    static class Child1 extends Parent{
        void count(){
            System.out.println("This is the count of the Child1 method!!");
        }
        public void display(){
            System.out.println("This is the child1 display method!");
        }
    }
    static class Child2 extends Parent{
        void count(){
            System.out.println("This is the count of the Child2 method!!");
        }
    }
    public static void main(String[] args) {
        Parent object1= new Child1();
        object1.count();
        object1.display();
        object1.salary();   
    }
}