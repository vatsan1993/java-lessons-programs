package ch2;

// String immutability
public class Chap2Ex10 {
    public static void main(String[] args) {
        String s= "Hello";
        //s[0]=’a’; // Not possible
        s.toUpperCase(); // creates a new string that we are not storing into any variable.
        String res= s.toUpperCase();
        System.out.println("s="+s); // s will not be changed at all.
        System.out.println("res= "+res);
        s=  s.toUpperCase();
        System.out.println("s after  permanent change= "+s); // s will be changed

    }
}
