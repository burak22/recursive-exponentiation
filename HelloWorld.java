public class HelloWorld{
    public static void main(String[] args) {
        System.out.println(exp(5, 2));
    }
    static int exp(int a, int b){
        if(b == 0) return 1;
        return a * exp(a, (b-1));
    }
}