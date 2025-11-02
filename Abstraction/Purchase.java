 class Purchase {
    void completePurchase(Myntra item) {
        System.out.println("Completing purchase...");
        item.placeOrder();
        System.out.println("Purchase completed.");
        System.out.println("-----------------------");
    }
}
