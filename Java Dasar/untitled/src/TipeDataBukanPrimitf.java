public class TipeDataBukanPrimitf {
    // main function
    public static void main(String[] args) {
        /**
         * Jika kita memasukan tipe data yang bukan primitif maka hasilnya
         * Null, atau kosong, beda jika kita menggunakan primitif hasilnya yaitu 0
         */

        /**
         * Contoh primitif = byte, short, dll
         * sedangkan yg bukan primitif = Byte, Short, Long, Dll
         */

        Integer iniBukanPrimitifINT = 1000;
        Long iniLongL = 10000L;
        // jika ingin inisialisasi value 0 tinggal
        Integer bukanPrimitifKedua = null;

        /**
         * Kita juga bisa konversi dari primitif ke bukan primitif
         */

        byte iniByte = 100;
        Byte konversiKeObjek = iniByte;
        /**
         * Bagaimana jika tidak kompitable ?
         */
        short KompitableShort = konversiKeObjek.shortValue();
        long KompitableLong = konversiKeObjek.longValue();
        /**
         * Dan masih banyak lainnya
         */
    }
}
