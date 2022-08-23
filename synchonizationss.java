class increment
{
    int count=0;
    public synchronized void increment()
    {
        count++;
    }
}
public class synchonizationss {
    public static void main(String[] args) throws Exception{
        increment i=new increment();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int k=0;k<1000;k++)
                i.increment();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int k=0;k<1000;k++)
                i.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i.count);
    }
}
