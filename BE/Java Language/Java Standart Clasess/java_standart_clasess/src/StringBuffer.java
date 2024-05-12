public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        // append untuk menambahkan sebuah objek
        builder.append("Ibnu Rusdianto");
        builder.append("Heru Rusdianto");
        System.out.println(builder.toString());

        // insert untuk mengambil StringBuilder yang sudah ada
        StringBuilder builder1 = new StringBuilder("Ibnu");
        builder1.insert(2, "Ganteng");
        System.out.println(builder1);

        // replace
        StringBuilder builder2 = new StringBuilder("Ibnu Rusdianto");
        builder2.replace(1, 3, "Hai");
        System.out.println(builder2.toString());

        // delete
        StringBuilder builder3 = new StringBuilder("Heru");
        builder3.delete(1,3);
        System.out.println(builder3.toString());

//        builder.insert(2, "h");

    }
}
