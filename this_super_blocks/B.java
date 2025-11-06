//super 
class C{
    C(){
        this(10); //calls one arg constructor
        System.out.println("C's default constructor");
    }
    C(int x){
        System.out.println("C's one arg constructor");
    }   
}
class B extends C{
    B(){
        super(); //calls parent class constructor
        System.out.println("B's default constructor");
    }
    public static void main(String[] args){
         new B();
    }
}
    

