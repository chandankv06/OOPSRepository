class Callbyref{
    int x,y;
    void getvalue(Callbyref o) {
        o.x += 5;
        o.y *= 2;
        System.out.println("the value of x in method "+x);
        System.out.println("the value of y in method "+y);
    }
}
public class callbyreference {
    public static void main(String args[]){
        Callbyref o=new Callbyref();
         o.x=5;
         o.y=10;
        System.out.println("value of x "+o.x);
        System.out.println("value of y "+o.y);
        o.getvalue(o);
        System.out.println("after method execution x "+o.x);
        System.out.println("after method execution y "+o.y);
    }
}
