package person;

public class Biodata {
    // deklarasi field
    String nama;
    int umur;
    String alamat;
    int no_hp;


//    membuat sebuah constuctor
    Biodata(String nama, int umur, String alamat, int no_hp){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }

    // getter name
    public String getNama(){
        return nama;
    }

    // getter umur
    public int getUmur(){
        return  umur;
    }

    // getter alamat
    public String getAlamat(){
        return alamat;
    }

    public long getNo_hp(){
        return no_hp;
    }

    // setter name, alamat, umur, no_hp
    public void setteR(String nama, int umur, int no_hp, String alamat ){
        this.nama = nama;
        this.umur = umur;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }

    public void printDetails()
    {
        System.out.println("Name : " + this.nama);
        System.out.println("Age : " + this.umur);
        System.out.println("Number Phone : " + this.no_hp);
        System.out.println("Alamat : " + this.alamat);
        System.out.println();
    }
}
