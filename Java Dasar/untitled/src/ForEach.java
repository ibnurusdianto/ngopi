public class ForEach {
    // main function
    public static void main(String[] args) {
        int[] nilai = {150,190,200,800};
        int nilai_tertinggi = maximum(nilai);
        System.out.println("Nilai tertinggi adalah : " + nilai_tertinggi);
    }
    public static int maximum(int[] numbers){
        int cekNIlai = numbers[0];
        // lakukan foreachLoop
        for (int num : numbers){
            if (num > cekNIlai){
                cekNIlai = num;
            }
        }
        return cekNIlai;
    }
}
