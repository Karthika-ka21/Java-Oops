//super
class I {
   I() {
      System.out.println("I() in Parent");
   } 
    I(int x) {
        this();
        System.out.println("I(int) in Parent");
    }
}
class J extends I{
    J(){
        super(10);
        System.out.println("J() in Child");
    }
}
class Test{
    public static void main(String args[]){
        J obj = new J();
    }
}
