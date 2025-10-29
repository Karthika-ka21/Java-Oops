//non static blocks
class E{
    int i;
    {
        System.out.println("non static block");
        System.out.println(i); //0
        i = 20;
        
    }
    E(){
        System.out.println("constructor");
        System.out.println(this.i);
    }
    static void m1(){
        System.out.println("static method");
    }
    void m2(){
        System.out.println("instance method");
    }
    public static void main(String[] args){
        System.out.println("main method");
        E.m1();
        E e = new E();
        e.m2();
    }
}