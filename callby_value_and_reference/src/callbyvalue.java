class Callbyvalue{
    void calculate(int x,int y){
        x+=2;
        y*=5;
        System.out.println("value of x in method "+x);
        System.out.println("value of y in method "+y);
    }
}
public class callbyvalue {
    public static void main(String args[]){
       int x=10,y=5;
        System.out.println("value of x "+x);
        System.out.println("value of y "+y);
        Callbyvalue obj=new Callbyvalue();
        obj.calculate(x,y);
        System.out.println("after execution of method "+x);
        System.out.println("after execution of method "+y);
    }
}
