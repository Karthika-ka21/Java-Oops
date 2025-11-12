 class G {
    int y=2;
   
    String str="hi all";
    int m1(){
        int x=1;
        return x;
    }
    String display(String Msg){
        System.out.println(Msg);
        return str;
    }
    public static void main(String[] args){
        Object o1=new String("abcd");
        Object o2=new String("abc");
        System.out.println(o2); //toString() in child class(String()) is executed since toString() is non static method late binding happens
        System.out.println(o1==o2);
           System.out.println(o1.equals(o2));//equals() in child class ie String class is implemented
        o2=o1;
        G g=new G();
        String str=g.display("hello");
        System.out.println(str);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1==o2);
        System.out.println(o1.equals(o2));
        System.out.println(g.y);
        int x=g.m1();
        System.out.println(x);
        
    }
    
}
