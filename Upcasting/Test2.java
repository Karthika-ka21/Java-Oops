class A{
    int y=1;
    void m1(){
        System.out.println("m1 in A");
    }
}
class B extends A{
    int x=5;
    void m2(){
        System.out.println("m2 in B");
    }
}
class C extends A{
    int z=6;
    void m3(){
        System.out.println("m3 in C");
    }
}
class Test2{
    public static void main(String[] args){
        B b1=new B();
        b1.m1();
        b1.m2();
        System.out.println(b1.x);
        System.out.println(b1.y);

        A a1=b1;
        a1.m1();
        // a1.m2(); error
        System.out.println(a1.y);
        // System.out.println(a1.x); error

        C c1=new C();
        c1.m1();
        c1.m3();
        System.out.println(c1.y);

        A a2=new C();
        a2.m1();
        // a2.m3(); error
        System.out.println(a2.y);
        // System.out.println(a2.z); error

        A a3=new A();
        a3.m1();
        System.out.println(a3.y);
        // a3.m3(); error
        // System.out.println(a3.z); error

    }
}