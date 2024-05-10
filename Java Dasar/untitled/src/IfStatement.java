public class IfStatement {
    // main funciton
    public static void main(String[] args) {
        /**
         * If statement adalah sebuah pengecekan kondisi terpenuhi
         */
        int nilai = 75;
        int absen = 89;
        if (nilai >= 75 && absen >= 75){
            System.out.println("Selamat anda lulus");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Lulus dengan nilai CUKUP");
        } else {
            System.out.println("Maaf anda tidak lulus");
        }
    }
}
