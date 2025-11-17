import manager.emp;

public class RunnableThread {
    public static void main(String[] args)  throws  InterruptedException{
        
manager m1= new manager();
Thread t= new Thread(m1);
t.start();
t.join();
t.sleep(10000);


emp e1 = new emp();
Thread t2= new Thread(e1);
t2.start();
t2.join();
t2.sleep(5000);

    }
}

class manager implements  Runnable{

 @Override
 public void  run(){
    for( int i=0;i<=10;i++){
        System.out.println(" magager Runable thread ");
    }
 } 
}
 class emp implements Runnable{
@Override
 public void  run(){
    for( int i=0;i<=10;i++){
        System.out.println(" emp Runable thread ");
    }
 }
}
