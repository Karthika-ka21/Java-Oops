//static blocks
class D{
    static int i;
    static {
        System.out.println("static block");
        System.out.println(i); //0
        i = 10;
        D d = new D();
        System.out.println(d);    
    }
    D(){
        System.out.println("constructor");
        System.out.println(D.i);
    }
    static void m1(){
        System.out.println("static method");
    }
    void m2(){
        System.out.println("instance method");
    }
    public static void main(String[] args){
        System.out.println("main method");
        D.m1();
        D d = new D();
        d.m2();
    }
}
