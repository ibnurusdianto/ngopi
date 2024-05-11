public class PersonApp {
    // main class
    public static void main(String[] args) {
        // cara membuat object
        var person1 = new Person("Ibnu", "Subang");
        var person2 = new Person("Ibnu");

        // berikut adalah pemanggil field dalam class
        person1.nama = "Ibnu Rusdianto";
        person1.alamat = "Subang, Pusakajaya, Cigugur Kidul";
        person1.umur = 22;

        System.out.println("========== DATA FIELD PEMANGGILAN DARI CLASS ==========");
        System.out.println("Nama anda adalah : " + person1.nama);
        System.out.println("Alamat anda adalah : " + person1.alamat);
        System.out.println("Umur anda adalah : " + person1.umur);
        System.out.println("Negara anda adalah : " + person1.negara);
        System.out.println("========== END DATA FIELD PEMANGGILAN DARI CLASS ==========");

        System.out.println("===== PEMANGGILAN METHOD DALAM CLASS =====");
        person1.sayHello("Heru");
//        System.out.println(person1.sayHello("Heru"););


        // berikut contoh output dari person
//        System.out.println(person1);
    }
}
