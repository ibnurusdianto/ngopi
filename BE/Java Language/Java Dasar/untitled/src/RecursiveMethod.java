public class RecursiveMethod {

    // main function
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        factorialLoopin2 fct = new factorialLoopin2();
        System.out.println("Factorial 3 adalah : " + fct.fact(3));

    }
    // factorialVersiLooping
    static int factorialLoop(int value) {
        var result = 1;
        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }
    static class factorialLoopin2 {
        // membuat sebuah variable fact
        int fact(int n) {
            int result2;
            // cek jika n sama dengan 1 maka return 1
            if (n == 1) {
                return 1;
            } else {
                result2 = fact(n - 1) * n;
                return result2;
            }
        }
    }
}
