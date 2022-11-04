import java.util.HashSet;
public class App {
    public static void main(String[] args) {
        HashSet<String> objectes = new HashSet();
        objectes.add("Cadira");
        objectes.add("Taula");
        objectes.add("Finestra");
        objectes.add(null);
        objectes.add("Ordinador");
        objectes.add("Cable");
        objectes.add("Armari");
        System.out.println(objectes);
    }
}
