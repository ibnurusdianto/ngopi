public class SwitchStatement {
    // main function
    public static void main(String[] args) {
        int jumlah_hari = 7;
        String namaHari;
        switch (jumlah_hari){
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Tidak ditemukan!";
        }
        System.out.println(namaHari);
    }
}
