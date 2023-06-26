public class PriorityAndName {

    public static void main(String[] args) throws Exception{

        Thread mainObj=Thread.currentThread();
        System.out.println("Default priority of main="+mainObj.getPriority());
        System.out.println("Default name of main="+mainObj.getName());
        threadClassExp t1=new threadClassExp();
        System.out.println("Default Name of the thread created="+t1.getName());
        System.out.println("Default Priority of created thread="+t1.getPriority());
        t1.start();
        t1.join();
        threadClassExp t2=new threadClassExp();
        System.out.println("Default name of second thread created="+t2.getName());
        t2.setName("AnirudhThread");
        System.out.println("New name of the second thread created="+t2.getName());
        t2.setPriority(10);
        t2.start();

    }

}



class threadClassExp extends Thread{
    public void run(){

    }
}
