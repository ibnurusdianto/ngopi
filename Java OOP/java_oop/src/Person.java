// membuat class manusia
class Person {

    // deklarasi nama dengan tipe data string
    String nama;
    // deklarasi umur dengan tipe data integer
    int umur;
    // deklarasi alamat dengan tipe data string
    String alamat;

    // final, dimana negara tidak bisa diubah
    final String negara = "Indonesia - NKRI Harga Mati!";

    // membuat method 1
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + " My name is, " + nama);
    }

}
