import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> jugadors = new HashMap();
        jugadors.put("Barça", "Dembo");
        jugadors.put("Madrid", "Benzema");
        jugadors.put("PSG", "Messi");
        jugadors.put("Villareal", "Gerard Moreno");
        TreeMap<String, String> t = new TreeMap();
        t.putAll(jugadors);
        Iterator var3 = t.keySet().iterator();

        while (var3.hasNext()) {
            String key = (String) var3.next();
            System.out.println("Equip: " + key + ", Jugador: " + (String) t.get(key));
        }
    }
}