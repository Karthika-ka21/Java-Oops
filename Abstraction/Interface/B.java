 class B implements A {
   public void m2(A a) {
        System.out.println("B's implementation of m2");
    }
    public static void main(String[] args) {
        System.out.println("B's main method");
        B b = new B();
        b.m2(b); // Calling the implemented method
        A.m1(); // Calling the static method from interface A
        System.out.println("Value of x from interface A: " + A.x);
        A a = new B(); // upcasting
        a.m2(new B() ); // Calling the implemented method via interface reference
    }
}
