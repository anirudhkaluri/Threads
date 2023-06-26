public class Thread1 {
    public static void main(String[]args){
        //using a runnable interface
        exp1 obj=new exp1();
        Thread t1=new Thread(obj);
        t1.start();
    }
}


class exp1 implements Runnable{
    public void run(){
        System.out.println("I am in exp1");
    }
}
