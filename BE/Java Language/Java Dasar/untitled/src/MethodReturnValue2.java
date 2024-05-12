public class MethodReturnValue2 {
    // main function
    public static void main(String[] args) {
        int total = sum(80, 90);
        System.out.println("Hasilnya adalah : " + total);

        // bisa juga menggunakan cara berikut ini
        System.out.println("Hasilnya adalah 2 : " + sum(120,300));
    }

    public static int sum (int n1, int n2){
        int total = n1 + n2;
        return total;
    }
}
