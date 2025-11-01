abstract class C{
    abstract void m3();
    void m4(){
        System.out.println("C's concrete method m4");
    }
}
class D extends C{
    public static void main(String[] args) {
        System.out.println("D's main method");
        D d1 = new D();
        d1.m3();
        d1.m4();
    }
    @Override
    void m3(){
        System.out.println("D's implementation of abstract method m3");
    }
}
