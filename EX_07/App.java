import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ArrayList<String> assignatures = new ArrayList();
        assignatures.add("Programació");
        assignatures.add("DAW-DWES");
        assignatures.add("DAW-DWEC");
        assignatures.add("DAW-DAW");
        Iterator<String> it = assignatures.iterator();
        System.out.println((String)it.next());

        while(it.hasNext()) {
            String item;
            System.out.println(item = (String)it.next());
            if (item.equals("Programació")) {
                it.remove();
            }
        }

        System.out.println(assignatures);
    }
}