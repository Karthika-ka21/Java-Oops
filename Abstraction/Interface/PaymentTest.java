
public class PaymentTest {
    public static void main(String[] args){
        BillPayment bp=new BillPayment();
        UpiPayment upi=new UpiPayment();
        NetPayment net=new NetPayment();
        bp.makePayment(upi);
        bp.makePayment(net);
    }
}
