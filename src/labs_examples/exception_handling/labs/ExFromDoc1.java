package labs_examples.exception_handling.labs;

public class ExFromDoc1 {


    public static void main(String[] args){
        try {
            Student someStudent = new Student();
            addStudentToClassroom(someStudent);
        } catch (ClassroomFullException exc) {
            System.out.println("Unfortunately the classroom is full. We are unable to add this student");
        }
    }

    public static void addStudentToClassroom(Student student) throws ClassroomFullException {
        Student someStudent = new Student();
        Classroom someClassroom = new Classroom();
        if (someClassroom.size < 25) {
            someClassroom.add(someStudent);
        } else {
            // manually throw new custom exception
            throw new ClassroomFullException();
        }
    }

}

class ClassroomFullException extends Exception {

    @Override
    public String toString() {
        return "ClassroomFullException{ This classroom is full}";
    }
}

class Student {

}

class Classroom{

    public int size;

    public void add(Student someStudent) {

    }
}
