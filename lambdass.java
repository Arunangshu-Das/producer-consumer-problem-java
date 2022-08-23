@FunctionalInterface
interface Abc{    //This is called functional interface .... Nothing is best than t .... it have only one function. and use to implement when object is making
    void show();
}

public class lambdass {
    public static void main(String[] args) {
        Abc ob=()->System.out.print("Hola");
        ob.show();
    }
}
