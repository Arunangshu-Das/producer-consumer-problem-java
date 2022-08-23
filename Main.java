class hi extends Thread
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

class hello extends Thread
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

public class Main {
    public static void main(String[] args) {
        hi a=new hi();
        hello b=new hello();
        a.start();
        b.start();
    }
}
