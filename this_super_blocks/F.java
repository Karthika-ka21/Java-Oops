class F{
    static{
        System.out.println("sb1");
        F f1=new F();
        G g1 = new G();
    }
    static{
        System.out.println("sb2");
        
    }
    {
        System.out.println("nsb1");
    }
     {
        System.out.println("nsb2");
    }
    public static void main(String[] args){
        System.out.println("main");
        F f2=new F();
    }
}
class G{
    {
        System.out.println("G's NSB");
    }
}