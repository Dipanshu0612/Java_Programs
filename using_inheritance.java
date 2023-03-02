class Animal {
    void print() {
        System.out.println("The print method is called!");
    }
}

class Dog extends Animal {
    void print() {
    }

    {
        System.out.println("The dog method is called! ");
        super.print();
    }
}

public class using_inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.print();
    }
}
