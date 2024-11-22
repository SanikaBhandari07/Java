public class D01 {

    public void sum(){
        public int i = 0;          // if it is public then why i was not able to access it in its own class
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println(i);
    }
}

// This is incorrect because the public modifier is not allowed for local variables in Java.
// The public modifier can only be used with fields (instance variables), 
// methods, classes, or constructors, but not with local variables inside methods.
