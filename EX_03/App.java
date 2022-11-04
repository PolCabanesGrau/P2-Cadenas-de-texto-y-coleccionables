public class App {
    public static void main(String[] args) {

        String frase = "El Francisco és molt bon professor";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != 'a') {
                System.out.println("El caràcter " + i + " no és una A");
            } else {
                System.out.println("El caràcter " + i + " és una A");
            }
        }
    }
}
