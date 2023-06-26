public class sleep1 {

    public static void main(String[]args){
        sleepExp obj=new sleepExp();
        Thread t1=new Thread(obj);
        System.out.println("Starting thread.....");
        t1.start();
        System.out.println("Thread started");

    }

}

class sleepExp implements Runnable{
    public void run(){
        System.out.println("This is the thread that is called. Now we are going to invoke sleep");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("Exception caught");
        }
        System.out.println("Called thread. Sleep executed");
    }
}