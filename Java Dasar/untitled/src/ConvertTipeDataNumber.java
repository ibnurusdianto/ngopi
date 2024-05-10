public class ConvertTipeDataNumber {
    // main function
    public static void main(String[] args) {
        /**
         * Konversi Tipe Data Number memiliki 2 jenis yaitu
         * ada yang otomatis dan juga manual.
         * dimana yang otomatis melakukan conversi yaitu widening casting
         * sedangkan yang manual itu yaitu narrowing casting
         *
         * jika menggunakan widening casting harus menggunakan aturan berikut ini :
         * byte -> short -> int -> long
         */

        // Otomatis konversi (widening casting)
        byte iniNilaiByte = 10;
        short BytekeShort = iniNilaiByte;
        int nextKeInt  = BytekeShort;
        long nextKeLong = nextKeInt;

        /**
         * Sedangkan berikut ini yaitu menggunakan secara manual.
         * namun ketika melakukan konversi otomatis kita harus hati-hati karena bisa menyebabkan
         * integer overflow
         */
        long iniNilaiLong = 100000;
        byte ApakahBisaKonversiKeByte = (byte) iniNilaiByte;
        System.out.println("Apakah error atau bisa ? " + ApakahBisaKonversiKeByte);
        double KonversiKeDouble = (double) iniNilaiLong;
        System.out.println("Hasil konversi long dijadikan double adalah : " + iniNilaiLong);

    }
}
