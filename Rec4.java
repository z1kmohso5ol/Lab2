public class Rec4 {
    public static int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }
    public static void main(String[]args){
        Rec4 fact = new Rec4();
        System.out.println(" 3! = " + fact.fact(3));
        System.out.println(" 4! = " + fact.fact(4));
        System.out.println(" 10! = " + fact.fact(10));
    }
}