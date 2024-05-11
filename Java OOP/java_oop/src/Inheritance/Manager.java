package Inheritance;

class Manager {
    String nama;
    String jabatan;

    void sayHelloManager(String nama, String jabatan){
        System.out.println("Hello " + nama + ", My name is " + this.nama);
        System.out.println("Saya yang mewakili role " + this.jabatan);
    }
}
