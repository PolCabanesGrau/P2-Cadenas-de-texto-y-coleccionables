import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W).{8,}$", 2);
        Matcher matcher = pattern.matcher("Poltora799&");
        boolean parametres = matcher.find();
        if (parametres) {
            System.out.println("La contraseña és segura");
        } else {
            System.out.println("La contraseña no és segura");
        }

    }
}
