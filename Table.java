
public class Table{
    synchronized  void printTable(int n) throws Exception{
        for(int i=1;i<6;i++){
            System.out.println((n*i));
            Thread.sleep(400);
        }
    }

      void printTableReverse(int n) throws Exception{
        for(int i=10;i>5;i--){
            System.out.println((n*i));
            Thread.sleep(400);
        }
    }
}
