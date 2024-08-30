class Demo{
    int num(int n) {
        if (n == 1) {
            return 1;
        }
        return n*num(n-1);
    }
}
public class Recursion {
    public static void main(String args[]){
        Demo obj=new Demo();
        int val=obj.num(5);
        System.out.println(val);
    }
}
