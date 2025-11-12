 
 class H {
    int x;
    int y;
    class A{
       int  x=7;
    }
   H(){
        x=5;
        y=10;
        return;
   } 
   int sub(int a,int b){
    return a-b;
   }
}
class I extends H{
    int a=20;
    int b=30;
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
    return 15;
   }
     public static void main(String[] args) {
        H h2=new I(); //upcasting
       // System.out.println(h2.a); error
       // System.out.println(h2.add(4,6)); error since add() not present in H at compiletime
       System.out.println(h2.sub(10,7)); //output 15(child class)
       H h=new H();
        System.out.println(h.x);
        System.out.println(h.y);
        A a=h.new A();
        System.out.println(a.x);
   }
 }
