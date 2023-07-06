public class OrderMatic implements Runnable{
    private int orderNo=0;
    private Object LOCK=new Object();
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (LOCK){
        this.orderNo++;
        System.out.println(Thread.currentThread().getName()+" -Order No: "+orderNo);
        }
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
