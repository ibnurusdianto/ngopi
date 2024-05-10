public class OperasiBoolean {
    // main function
    public static void main(String[] args) {
        /**
         * Operasi Boolean adalah operasi yang hanya memiliki 2 nilai yaitu
         * True dan false
         * dimana jika operasi DAN hasilnya harus true & true, jika salah satu atau keduanya bukan true maka otomatis bukan true
         * jika OR true salah satu atau keduanya maka nilainya true
         * Operasi kebalikan , dimana kebalikan true yaitu false dan sebaliknya.
         */

        int nilai = 75;
        int absen = 89;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusNilai && lulusAbsen;
        System.out.println("Hasilnya adalah : " + lulus);

    }
}
