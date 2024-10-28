public class MaxFinderTest {
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void output(){
        System.out.println("Nilai maksimum dari 1, 2, 3 adalah      : " + findMax(1,2,3));

        System.out.println("Nilai maksimum dari -1, -2, -3 adalah   : " + findMax(-1,-2,-3));

        System.out.println("Nilai maksimum dari 0, 0, 1 adalah      : " + findMax(0,0,1));

    }

    public static void main(String[] args) {
        output();


    }
}