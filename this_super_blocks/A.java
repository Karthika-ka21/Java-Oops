//this
class A{
    int x;
    A(){
        System.out.println("A's Constructor");
        System.out.println(this.x); //default value 0
    }
    A(int x){
        this(); //calls current class constructor
        System.out.println("A's one arg constructor");
        this.x = x;
        System.out.println(this.x);
    }
    A(int x, int y){
        this(10); //calls current class one arg constructor
        System.out.println("A's two arg constructor");
    }
}

class Test1{
    public static void main(String[] args){
        A a1 = new A(5,10);
        A a2 = new A(5);
        A a3 = new A();
    }
}