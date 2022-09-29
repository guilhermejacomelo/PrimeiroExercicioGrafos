
import java.util.ArrayList;
public class PrimeiroExempo {
    public static void main(String[] args) {
        ArrayList<String>listaContatosEu
                = new ArrayList<String>();

        listaContatosEu.add("Bob");
        listaContatosEu.add("Alice");
        listaContatosEu.add("Claire");


        ArrayList<String>listaContatosClaire
                = new ArrayList<String>();

        listaContatosClaire.add("Thom");
        listaContatosClaire.add("Jonny");

        ArrayList<String>listaContatosBob
                = new ArrayList<String>();

        listaContatosBob.add("Anuj");
        listaContatosBob.add("Peggy");

        ArrayList<String>listaContatosAlice
                = new ArrayList<String>();

        listaContatosAlice.add("Peggy");


        System.out.println("CHAVE | NOME");

        System.out.println("EU | " + listaContatosEu);
        System.out.println("Bob | " + listaContatosBob);
        System.out.println("Claire | " + listaContatosClaire);
        System.out.println("Alice | " + listaContatosAlice);

    }

}
