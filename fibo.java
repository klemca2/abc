public class fibo {
    public static void main(String[] args){
        int num=10;
        int a=0,b=1;
        System.out.print("Fibonacci Series up to "+num);
        for(int i=1;i<=10;++i){
            int sum= a+b;
            a=b;
            b=sum;
            System.out.print(" "+a);
        }
    }}