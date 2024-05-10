public class TipeDataArray {
    // main function
    public static void main(String[] args) {
        // cara pertama membuat array
        String array[];
        array = new String[3];
        array[0] = "Ibnu";
        array[1] = "Heru";
        array[2] = "Tina";

        // cara kedua membuat array
        String namaKeluarga [] = namaKeluarga = new String[3];
        namaKeluarga[0] = "Ibnu";
        namaKeluarga[1] = "Heru";
        namaKeluarga[2] = "Tina";

        // bisa juga membuat array intializer
        int[] nilai = {
                10,12,13,14
        };

        // operasi array
        // mengambil index
        System.out.println("Anak pertama adalah : " + namaKeluarga[1]);
        // menghitung panjang array
        System.out.println("Jumlah panjang array adalah : " + namaKeluarga.length);

        /**
         * Kita juga, bisa membuat array di dalam array
         */

        String[][] keluarga  = {
                {"Ibnu", "Heru", "Tina"},
                {"Esih", "Rusdin"}
        };

        // berikut operasi pemanggilan array di dalam array
        System.out.println(keluarga[0][2]);
    }
}
