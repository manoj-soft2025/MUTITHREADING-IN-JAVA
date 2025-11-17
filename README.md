# MUTITHREADING-IN-JAVA
HERE I CAN LEARN  ABOUT MULTITHREAING  IN JAVA 
FIRST OF ALL WE LEARN WHAT IS THREAD?

Thread is sparate path of execution  



Basically in java we can achive Multithreading two way's

1. thread class 

2. Runnable interface

 1.thread class :
===========

the using thread class here the some example 

here we can create new the class and  here we 
emp object we created and in that object through 
we call call  methods like 
obj.start();           
                                waiting 
obj.sleep();
obj.join();
synchronization(blocked)


package MULTITHREADING;

public class mThreadCalss {
    public static void main(String[] args)  throws InterruptedException {
        
    
            // =USING THREAD CLASS
        
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


2.Runnable interface:
================

Here small example of Runnable interface

the runnable interface we can passing thread constructor reference through we can achive the multithreading.

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

here the some details about multithreading 



