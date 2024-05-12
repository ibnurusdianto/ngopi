public class Method {
    // main function
    public static void main(String[] args) {
        /**
         * Metode adalah kode program yang akan kita panggil.
         * atau dalam bahasa pemrograman lain yaitu function
         */
        // ini contoh pemanggilan method
        Sapa();
        add penjumlahan = new add();
        int s = penjumlahan.Jumlahkan(1, 2);
        System.out.println("Totalnya adalah" + s);
    }
    public static void Sapa(){
        System.out.println("Hello World");
    }
    static class add {
        int angka = 0;
        static int Jumlahkan(int a, int b){
            int total = a + b;
            return total;
        }
    }
}
