class Q{
    int num;
    boolean valueSet=false;

    public synchronized void put(int num)
    {
        while(valueSet)
        {
            try{wait();}catch (Exception e){}
        }
        this.num=num;
        System.out.println("Put: "+num);
        valueSet=true;
        notify();
    }
    public synchronized void get()
    {
        while(!valueSet)
        {
            try{wait();}catch (Exception e){}
        }
        System.out.println("Get: "+num);
        valueSet=false;
        notify();
    }
}

class producer implements Runnable{
    Q q;
    producer(Q q)
    {
        this.q=q;
        Thread t1=new Thread(this,"Producer");
        t1.start();
    }
    public void run()
    {
        int i=0;
        while (true)
        {
            q.put(i++);
            try{ Thread.sleep(1000);} catch (Exception e){}
        }
    }
}

class consumer implements Runnable{
    Q q;
    consumer(Q q)
    {
        this.q=q;
        Thread t1=new Thread(this,"Consumer");
        t1.start();
    }
    public void run()
    {
        while (true)
        {
            q.get();
            try{ Thread.sleep(1000);} catch (Exception e){}
        }
    }
}

public class producerConsumer {
    public static void main(String[] args) {
        Q q=new Q();
        new producer(q);
        new consumer(q);
    }
}
