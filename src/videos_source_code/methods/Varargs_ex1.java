package videos_source_code.methods;

public class Varargs_ex1 {

    public static void main(String[] args){
        Varargs_ex1 obj = new Varargs_ex1();
        obj.varargsMethod("Hello", "world"); //passes varargsMethod two parameters
        System.out.println(" ");
        obj.varargsMethod("Hello", "varargs", "master"); //passes varargsMethod two parameters
    }

    // you can pass one or more Strings to the method below because it uses varargs
    public void varargsMethod(String...v){

// we can now iterate through each String in the array (called "v") created by the varargs parameter
        for (String word : v){
            System.out.println(word);
        }
    }
/*
Output From First Call to varargsMethod():
Hello
world


Output From Second Call to varargsMethod():
Hello
varargs
master
*/
}
