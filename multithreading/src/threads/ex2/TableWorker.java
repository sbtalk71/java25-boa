package threads.ex2;

public class TableWorker implements Runnable{
    private TablePrinter tablePrinter;
    private int num;

    public TableWorker(TablePrinter tablePrinter, int num) {
        this.tablePrinter = tablePrinter;
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (tablePrinter) {
            tablePrinter.printTable(num);
        }
    }
}
