package person;

class Person {
    String nama = "Ibnu Rusdianto";
    String alamat = "Subang";
    int umur = 22;
    double nilai = 20.20;

    // this keywords untuk menyelesaikan masalah pada shadowing
    Person(String nama, String address){
        this.nama = nama;
        this.alamat = address;
    }

    void sayHello (String name){
        System.out.println("Hello " + name + "Hello" + this.nama);
    }


}
