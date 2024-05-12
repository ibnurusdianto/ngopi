import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AplikasiTodolist {
    private static List<Todo> model = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void displayTodoList() {
        System.out.println("TODOLIST");
        if (model.isEmpty()) {
            System.out.println("Daftar todo kosong");
        } else {
            for (int i = 0; i < model.size(); i++) {
                Todo todo = model.get(i);
                System.out.println((i + 1) + ". " + todo.getTask());
            }
        }
    }
    public static void addTodo(String task) {
        model.add(new Todo(task));
    }
    public static boolean removeTodo(Integer number) {
        if (number - 1 >= model.size() || model.get(number - 1) == null) {
            return false;
        } else {
            model.remove(number - 1);
            return true;
        }
    }
    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    public static void showMenu() {
        System.out.println("MENU : ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. Keluar");
    }
    public static void handleMenu() {
        while (true) {
            showMenu();

            String input = input("Pilih");

            if (input.equals("1")) {
                addTodo();
            } else if (input.equals("2")) {
                removeTodo();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    private static void addTodo() {
        String task = input("Todo (x Jika Batal)");
        if (!task.equals("x")) {
            addTodo(task);
        }
    }

    private static void removeTodo() {
        displayTodoList();
        String numberStr = input("Nomor yang Dihapus (x Jika Batal)");
        if (!numberStr.equals("x")) {
            try {
                int number = Integer.parseInt(numberStr);
                if (removeTodo(number)) {
                    System.out.println("Todo ke-" + number + " berhasil dihapus");
                } else {
                    System.out.println("Gagal menghapus todo");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukan bukan angka yang valid");
            }
        }
    }

    public static void mainMenu() {
        while (true) {
            displayTodoList();
            handleMenu();
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        mainMenu(); // Memulai aplikasi
    }
}

class Todo {
    private String task;

    public Todo(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
