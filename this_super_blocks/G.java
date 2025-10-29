public class G {
    {
        System.out.println("G's NSB");
        G g1 = new G();//infinite recursion
    }
    static{
        System.out.println("G's SB");
    }
    public static void main(String[] args){
        System.out.println("G's main");
        G g2 = new G();
    }
}
