public class MethodReturnValue {
    public static class matematika{
        double nilai (double nilai1, double nilai2){
            double sum = 0;
            sum = (nilai1 + nilai1) / 2.0;
            return sum;
        }
    }
    // main function
    public static void main(String[] args) {
        System.out.println(new matematika().nilai(5.5, 7.6));
    }
}
