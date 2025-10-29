//basics
class A{}
class B extends A{}
class C extends A{}
class Test{
    public static void main(String[] args) {
        A a1=new A();
        A a2=(A)new B();
        A a3=new C();
        B b1=new B();
        // B b2=new A(); error
        Object o1=new A();
        Object o2=new Object();

    }
}