public class join1 {

    public static void main(String[]args){
        threadClass t1=new threadClass();
        System.out.println("We careated the thread object. going to call the start method");
        t1.start();
        System.out.println("Called the Start method");
        try {
            t1.join();
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
        System.out.println("Thread execution completed. Print statement after join");

    }
}

class threadClass extends Thread{
    public void run(){
        for(int i=0;i<10000;i++)
            System.out.print(i+",");
    }
}