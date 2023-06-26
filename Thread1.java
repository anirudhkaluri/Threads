public class Thread1 {
    public static void main(String[]args){
        //using a runnable interface
        exp1 obj=new exp1();
        Thread t1=new Thread(obj);
        t1.start();

        //using a String constructor
        Thread t2=new Thread("My second thread");
        t2.start();
        String tname=t2.getName();
        System.out.println("The name of the thread is:"+tname);

        //using thread class
        exp2 t3=new exp2();
        t3.start();
    }

}


class exp1 implements Runnable{
    public void run(){
        System.out.println("I am in exp1");
    }
}


class exp2 extends Thread{
    public void run(){
        System.out.println("I am in exp2 which extends Thread");
    }
}
