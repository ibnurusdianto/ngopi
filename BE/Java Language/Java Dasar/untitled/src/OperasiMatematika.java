public class OperasiMatematika {
    // main fucntion
    public static void main(String[] args) {
        // angka
        int nilai1 = 20;
        int nilai2 = 76;

        // penjumlahan
        System.out.println("Nilai Penjumlahan adalah : " + nilai1 + nilai2);

        // Perkalian
        System.out.println("Nilai Perkalian adalah : " + nilai1 * nilai2);

        // Pembagian
        System.out.println("Pembagian adalah : " + nilai1 / nilai2);

        // Modulo
        System.out.println("Pengurangan adalah : " + nilai1 % nilai2);

        /**
         * Bisa juga menggunakan augmented assigment
         */
        nilai2+= 20;
        nilai2*= 20;
        nilai2%= 20;
        nilai2-= 20;

        /**
         * Bisa juga unaryOperator
         */
        nilai1++;
        nilai1--;




    }
}
