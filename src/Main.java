import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic=new OrderMatic();
        ExecutorService pool=Executors.newFixedThreadPool(10);
        //List<Thread> list=new ArrayList<>();
        for(int i =0;i<100;i++){
            pool.execute(oMatic);
          /* Thread t=new Thread(oMatic);
            list.add(t);
            t.start();

        }
        for(Thread t:list){
            t.join();

        }*/


    }
        pool.shutdown();
        System.out.println(oMatic.getOrderNo());
    }
}
