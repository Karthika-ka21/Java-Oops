
class B extends A {
    int y=10;
    public static void main(String[] args){
        B b1 = new B();
        System.out.println("x: " + b1.x);
        System.out.println("y: " + b1.y);
        A a1=new B(); //upcasting
        System.out.println("a1.x: " + a1.x);
        B.m1(); //A.m1(); possible
        a1.m2();
       // System.out.println(a1.y); not possible
    }
}
