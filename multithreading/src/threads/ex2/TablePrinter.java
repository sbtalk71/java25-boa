package threads.ex2;

public class TablePrinter {

    public  void printTable(int num){
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
