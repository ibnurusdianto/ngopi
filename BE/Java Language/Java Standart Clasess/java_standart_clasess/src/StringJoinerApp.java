// import library string joiner
import java.util.StringJoiner;

public class StringJoinerApp {
    // main function
    public static void main(String[] args) {
        // membuat array names keluarga
        String[] names = {
                "Ibnu", "Heru", "Tina"
        };

        // deklarasikan string joiner
        StringJoiner joiner = new StringJoiner(",", "[", "]");
    }
}
