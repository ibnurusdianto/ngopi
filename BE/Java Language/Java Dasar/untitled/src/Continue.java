public class Continue {
    // main function
    public static void main(String[] args) {
        for (int counter = 0; counter < 10;  counter++){
            // jika ingin yang ditampilkan bilangan bulat, maka ubah 0 jadi 1
            if (counter % 2 == 0){
                continue;
            }
            System.out.println("Bilangan ganjil : " + counter);
        }
    }
}
