public class Customer {
    public static void main(String[] args){
        Purchase p = new Purchase();
        p.completePurchase(new Clothes());
        p.completePurchase(new Footwear());
        p.completePurchase(new Beauty());
    
}
}
