package labs_examples.exception_handling.labs;

public class ExFromDoc2 {

    public static void main(String[] args){
        try {
            Person somePerson = new Person(19);
            Wine vino = purchaseWine(somePerson, "white");
        } catch (UnderAgeException exc) {
            System.out.println("Unfortunately you must be 21 to purchase alcohol");
        }
    }

    public static Wine purchaseWine(Person person, String style) throws UnderAgeException {
        if (person.age >= 21) {
            return new Wine(style);
        } else {
            // manually throw new custom exception
            throw new UnderAgeException("underage");
        }
    }
}


class UnderAgeException extends Exception {

    public UnderAgeException(String underage) {

    }

    @Override
    public String toString() {
        return "UnderAgeException{ Must be 21 to purchase alcohol }";
    }
}

class Person {
    public int age;

    public Person(int i) {

    }
}

class Wine {
    public Wine(String style) {

    }
}


class OutofBounds
{
    public static void main(String args[]) {
        int[] numArray = {1981, 1983, 1985, 1987};

        try{
            System.out.println(numArray[6]);
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("this index does not exist");
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("done with try-catch-finally");
    }
}

