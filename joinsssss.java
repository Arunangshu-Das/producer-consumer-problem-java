public class joinsssss {
    public static void main(String[] args) throws Exception
    {
        Runnable obj1=()->{
            for(int i=0;i<5;i++)
                System.out.println("hello"+Thread.currentThread().getPriority());
        };
        Runnable obj2=()->{
            for (int i=0;i<5;i++)
                System.out.println("hi");
        };
        Thread t1=new Thread(obj1,"Arun");
        Thread t2=new Thread(obj2,"Ma");
//        t1.setName("Arunangshu");
//        t2.setName("Hola");
        t1.start();
        t2.start();
        t1.setPriority(1);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.join();
        t2.join();
        System.out.println("bye");
    }
}

