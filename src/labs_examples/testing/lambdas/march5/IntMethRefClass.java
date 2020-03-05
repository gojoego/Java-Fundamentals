package labs_examples.testing.lambdas.march5;

    //    Instance Method Reference:
//Instance method reference of an object of a particular type
@FunctionalInterface
interface MyInterface{
    void display();
}

class Group {
    String name;
    public Group(String name) {
        this.name = name;
    }
    public void sayHi(){
        System.out.println("Hi, " + name + "!");
    }
}

class InstanceRefDemo {
    public static void main(String[] args) {
        Group obj = new Group("CodingNomads");
        // swapping a custom Lambda body with a reference to the sayHi() method in this Example class
        MyInterface ref = obj::sayHi;
        // Calling the method of functional interface
        ref.display();
    }
}
