//this()
class H{
    H(){
        System.out.println("H()");
    }
    H(int x){
        this();
        System.out.println("H(int)");
    }
    void m1(){
        // this(10); error only use in constructors
        System.out.println("m1 in H");
    }
    public static void main(String[] args){
        new H(5).m1();
    }

    
}
