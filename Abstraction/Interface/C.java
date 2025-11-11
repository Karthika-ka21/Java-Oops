interface C {
    private static void display(){
        System.out.println("Private method in interface C");
    }
    private static void display(int a){
        System.out.println("Private method with int parameter in interface C: " + a);
    }
    private void showDetails(){
        System.out.println("Private non-static method in interface C");
    }
    //static and default methods in interface are poossible from Java 8 onwards
    //private methods(static&non-static) are possible in interface from Java 9 onwards
    //we can overload private methods

    //default methods are public by default, we can't modify their access specifier
    default void show(){
        System.out.println("Default method in interface C");
        C.display();
        showDetails();
        display(5);
    }

}
class D implements C{
    {
        C.super.show();
    }
    D(){
        System.out.println("Constructor of class D");
    }
    @Override
    public void show(){
        System.out.println("Overridden default method in class D");
        
    }
    public static void main(String[] args) {
        D d1=new D();
        d1.show();
        
    }
    // default void m1(){
    //     System.out.println("default method in class D");
    // } default methods are only allowed in interface
    

}
