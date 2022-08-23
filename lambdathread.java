public class lambdathread {
    public static void main(String[] args) {
        Runnable obj1=()->{
                for(int i=0;i<5;i++)
                    System.out.println("hello");
        };
        Runnable obj2=()->{
                for (int i=0;i<5;i++)
                    System.out.println("hi");
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        System.out.println("bye");
    }
}
