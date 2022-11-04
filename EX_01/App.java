public class App {
    String nom = "Pol Carlos Cabanes Grau";

    public static void main(String[] args) {
        App app = new App();
        app.PartsNom();
    }

    public void PartsNom(){
        String[] partsNom = nom.split(" ");
        String partsNom2 = partsNom[partsNom.length-1];
        String partsNom3 = partsNom[partsNom.length-2];
        String partsNom1 = partsNom[partsNom.length-3];
        String partsNom0 = partsNom[0];

        char inicial = partsNom0.charAt(0);
        char inicial1 = partsNom1.charAt(0);

        if(partsNom.length>3){
            System.out.println(partsNom2 + " " + partsNom3 + " " + inicial + " " + inicial1);
        }else{
            System.out.println(partsNom2 + " " + partsNom3 + " " + inicial);
        }


    }
}
