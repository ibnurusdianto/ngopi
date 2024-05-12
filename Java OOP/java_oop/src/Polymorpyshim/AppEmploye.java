//package Polymorpyshim;
//
//public class AppEmploye {
//    public static void main(String[] args) {
//        Employe employe = new Employe("Ibnu");
//        employe.sayHello("Ibnu");
//
//        employe = new Manager("Heru");
//        employe.sayHello("Heru");
//
//        employe = new VicePresident("Tina");
//        employe.sayHello("Tina");
//
//        sayHello(employe);
//        sayHello(employe);
//        sayHello(employe);
//
//        // type check & cast
//        static void sayHello(Employe ) {
//            if (employe instanceof VicePresident) {
//                VicePresident vicePresident = (VicePresident) employe;
//                System.out.println("Hello VP " + vicePresident.name);
//            } else if (employe instanceof Manager) {
//                Manager manager = (Manager) employe; // Correct casting
//                System.out.println("Hello Manager " + manager.name);
//            } else {
//                System.out.println("Hello " + employe.name);
//            }
//        };
//    }
//}
