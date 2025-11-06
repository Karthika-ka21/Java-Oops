class A{
    int i=5;
    public String x;
    void m1(){
    System.out.println("m1 in class A ");}
    static{
        System.out.println("static block in A");
    }
    A(){
        System.out.println("constructor in A");
    }
     A(int a){
        System.out.println(" int constructor in A");
    }
}

class B extends A{
    int i=20;
    B()
    {
        System.out.println("Constructor in B");
    }
    B(int x){
        super();
        System.out.println("int argument constructor in B");
    }
    B(int x, int y){
        System.out.println("2 argument constructor in B");  
    }
    {
        System.out.println(super.i);
    }
    public static void main(String[] args) {
       B b1= new B(10,5);
       
       System.out.println(b1.i);
       b1.m1();

        
    }
}
