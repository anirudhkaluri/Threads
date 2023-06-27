public class Sync2 {
    public static void main(String[]args){
        //Table defined in the Table class file
        Table obj=new Table();
        //lets see if calling one synchronized method will lock the entire object
        //we will do this by calling two synchronized methods in the Table class defined and implemented in Sync1
        //we will use the TableThreadStraight and TableThreadReverse class
        //TableThreadStraight will call printTable of the obj
        //TableThreadReverse will call printTableReverse of the obj
        //printTableReverse is not a synchrnoized method
        System.out.println("Calling two synchronized methods with two different thread objects");
        TableThreadStraight t1=new TableThreadStraight(obj,5);
        TableThreadReverse t2=new TableThreadReverse(obj,8);
        t1.start();
        t2.start();
    }
}

class TableThreadStraight extends Thread{

    Table t;
    int n;
    TableThreadStraight(Table t,int k){
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

class TableThreadReverse extends Thread{

    Table t;
    int n;
    TableThreadReverse(Table t,int k){
        this.t=t;
        n=k;
    }
    public void run(){
        try {
            t.printTableReverse(n);
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
    }
}






