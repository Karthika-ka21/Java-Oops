class D{
    void m1()
    {
        System.out.println("m1 in D");
    }
}
class E extends D{
    void m2()
    {
        System.out.println("m2 in E");
    }
}
class F extends E{
    void m3()
    {
        System.out.println("m3 in F");
    }
}
class Test3{
    public static void main(String[] args) {
        F f1=new F();
        f1.m1();
        f1.m2();
        f1.m3();
        System.out.println("--------------------------");
        E e1=new E();
        e1.m1();
        e1.m2();
        // e1.m3(); error
        System.out.println("--------------------------");
        D d1=new D();
        d1.m1();
        // d1.m2(); error
        // e1.m3(); error
        System.out.println("--------------------------");

        E e2=new F();
        e2.m2();
        e2.m1();
        // e2.m3(); error
    }
}