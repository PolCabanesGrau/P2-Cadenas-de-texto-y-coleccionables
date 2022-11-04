import java.nio.charset.StandardCharsets;

public  class App {
    public static void main(String[] args) {
        String frase = "Messi, nominado balón de oro";
        String cadena = frase.trim().replaceAll(" ", "").toLowerCase();
        char[] arrayfrase = cadena.toCharArray();
        String[] fraseLletra = cadena.split("");

        for(int i = 0; i < cadena.length(); ++i) {
            byte[] bytes = cadena.getBytes(StandardCharsets.US_ASCII);
            System.out.println("ASCII: " + bytes[i] + " equival a la lletra: " + arrayfrase[i]);
        }

    }

}

