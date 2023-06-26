public class join1 {

    public static void main(String[]args) throws Exception{
        threadClass t1=new threadClass();

        t1.start();
        System.out.println("Called the Start method.calling join now.");

        t1.join();


        System.out.println("\nThread execution completed. Print statement after join");

    }
}

class threadClass extends Thread{
    public void run(){
        for(int i=0;i<1000;i++)
            System.out.print(i+",");
    }
}