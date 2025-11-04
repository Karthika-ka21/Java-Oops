 class Solution implements Men,Women {

    @Override
    public void placeOrder(Men m) {
        System.out.println("Order placed successfully for Men.");
    }

    @Override
    public void placeOrder(Women  m) {
        System.out.println("Order placed successfully for Women.");
    }

    @Override
    public void login() {
        System.out.println("Logged in successfully.");
    }

    @Override
    public void westernDress() {
        System.out.println("Western dress selected.");
    }
    @Override
    public void formalWear() {
        System.out.println("Formal wear selected.");
    }
 
}
