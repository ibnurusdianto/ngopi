public class TernaryOperator {
    // main funciton
    public static void main(String[] args) {
        int n1,n2,max;
        n1 = 5;
        n2 = 10;

        System.out.println("Nilai rendah : " + n1);
        System.out.println("Nilai medium : " + n2);

        // ternary operator
        /**
         * nilai max dihitung :
         * jika n1 lebih besar dari n2 maka hasilnya n1 (5), jika salah maka hasilnya
         * n2 (10), 5 > 10 ? false (jadi nilainya adalah 10)
         */
        max = (n1 > n2) ? n1 : n2;
        System.out.println("Nilai untuk variable max adalah : " + max);
    }
}
