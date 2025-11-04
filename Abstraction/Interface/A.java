interface A{
    int x=10; // public static final by default
    // x=2; error: cannot assign a value to final variable x
    static int a=30; // public static final by default
    static void m1(){
        System.out.println("A's static method m1");
    }
    void m2(A a);
    public static void main(String[] args) {
        System.out.println("A's main method");
        m1(); //A.m1() can be called directly
        //A a = new A() ;  Cannot instantiate the interface directly
    };

}

