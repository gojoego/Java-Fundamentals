package labs_examples.objects_classes_methods.labs.methods;

import javafx.scene.shape.Rectangle;

public class PassByReference {

    public static void main(String[] args) {

        Cher cher = new Cher(73);

        System.out.println(cher.toString());

        birthday(cher);

        System.out.println(cher.toString());

    }

    public static void birthday(Cher cher){
        cher.age = cher.age + 1;
    }

    public static class Cher {

        int age;

        public Cher(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cher{" +
                    "age=" + age +
                    '}';
        }
    }
}
