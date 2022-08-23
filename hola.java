class hi1 implements Runnable
{
    public void show()
    {
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try
            {
                Thread.sleep(500);
            } catch (Exception e) {}}
    }
    public void run(){show();}
}

class hello1 implements Runnable
{
    public void show()
    {
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try
            {
                Thread.sleep(500);
            } catch (Exception e) {}}
    }
    public void run(){show();}
}

public class hola {
    public static void main(String[] args) {
        hi1 a=new hi1();
        hello1 b=new hello1();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}
