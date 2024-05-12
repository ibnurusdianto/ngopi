package Inheritance;

public class AppManager {
    public static void main(String[] args) {
        var mng = new Manager();
        mng.nama = "Ibnu Rusdianto";
        mng.jabatan = "CEO";
        mng.sayHelloManager("Ibnu", "CEO Founder");

        var vice = new VicePresident();
        vice.nama = "Heru Rusdianto";
        vice.jabatan = "Founder";
        vice.sayHelloManager("Ibnu", "CEO Founder");
    }
}
