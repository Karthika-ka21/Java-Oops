class SingleTonClass{
    private static SingleTonClass s=null;
    int x=10;
    private SingleTonClass(){

    }
    public static SingleTonClass getInstance(){
        if(s==null)
            s= new SingleTonClass();
        return s;
    }
}
class Test{
    public static void main(String[] args) {
        SingleTonClass s1=SingleTonClass.getInstance();
        SingleTonClass s2=SingleTonClass.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.x);
        s1.x-=1;
        System.out.println(s2.x);
        s2.x-=5;
        System.out.println(s1.x);
    }
}