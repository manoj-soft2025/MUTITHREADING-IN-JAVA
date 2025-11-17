package MULTITHREADING;

public class MultiThreadingTest {
    public static void main(String[] args)  throws InterruptedException {
        
    
    	// USING THREAD CLASS
        
		Employee r = new Employee();
	    r.start();
        r.join();
        r.sleep(10000);
        manager m = new manager();
        
         m.start();

       
	    
    }}
	
	class Employee extends Thread{
	    
	   @Override 
	   public  void run(){
         for(int i=0;i<=10;i++){
	      System.out.println("Hello this is  employee tread class");
          try {
                Thread.sleep(500); // employee thread sleeps 0.5 sec
            } catch (Exception e) {}
	      
         }
        }}
	class manager extends Thread{
	    
	   @Override 
	   public  void run(){
         for(int i=0;i<=10;i++){
	      System.out.println("Hello this is manager tread class");
          try {
                Thread.sleep(500); // employee thread sleeps 0.5 sec
            } catch (Exception e) {}
	      
         }
	      
	   }
    }

