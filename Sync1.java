public class Sync1 {
    //to see what happens without synchronized remove synchronized in the printTable method
    public static void main(String[]args){
        Table obj=new Table();
        TableThread t1=new TableThread(obj,5);
        TableThread t2=new TableThread(obj,8);
        t1.start();
        t2.start();

    }
}

class TableThread extends Thread{

    Table t;
    int n;
    TableThread(Table t,int k){
        this.t=t;
        n=k;
    }
    public void run(){
        try {
            t.printTable(n);
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
    }
}





class Table{
    synchronized  void printTable(int n) throws Exception{
        for(int i=1;i<6;i++){
            System.out.println((n*i));
            Thread.sleep(400);
        }
    }
}
