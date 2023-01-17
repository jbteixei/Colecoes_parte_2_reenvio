import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExemploColecoes2 {

    public static void main(String[] args) {
        digitacaoNomesNoConsole();
        ordenacaoDosNomesEmOrdemAlfabetica();
        parteDoisDoExercicio();


    }

    private static void parteDoisDoExercicio() {
        System.out.println(" ");
        System.out.println("segundaParteDoExercicio");
        System.out.println(" ");
        System.out.println("***** listaDeNomesMasculinosEFemininos *****");
        String nome = "Fábio-M, Amanda-F, Fernanda-F, José-M, Luiz-M, Márcia-F";
        System.out.println(nome);
        System.out.println(" ");
        System.out.println("***** grupoDePessoasDoSexoMasculino *****");
        String[] nomes = nome.split(",");
        System.out.println("Nome: " + nomes[0]);
        System.out.println("Nome: " + nomes[3]);
        System.out.println("Nome: " + nomes[4]);
        System.out.println(" ");
        System.out.println("***** grupoDePessoasDoSexoFeminino *****");
        String[] pessoas = nome.split(",");
        System.out.println("Nome: " + pessoas[1]);
        System.out.println("Nome: " + pessoas[2]);
        System.out.println("Nome: " + pessoas[5]);

    }

    private static void digitacaoNomesNoConsole() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("primeiraParteDoExercicio");
        System.out.println(" ");
        System.out.println("Digite alguns nomes:");
        System.out.println("João, Maria, Fernando, Alberto, Carlos");
        String texto = teclado.next();
        teclado.close();
        System.out.println(" ");

        System.out.println("***** exemploListaDeNomes *****");
        texto = "João, Maria, Fernando, Alberto, Carlos";
        System.out.println(texto);
        System.out.println(" ");
        System.out.println("***** separaçãoDeNomesComSplitPelaVirgula *****");

        String[] valoresArray = texto.split(",");
        System.out.println("nome: " + valoresArray[0]);
        System.out.println("nome: " + valoresArray[1]);
        System.out.println("nome: " + valoresArray[2]);
        System.out.println("nome: " + valoresArray[3]);
        System.out.println("nome: " + valoresArray[4]);
        System.out.println(" ");
    }

    private static void ordenacaoDosNomesEmOrdemAlfabetica() {
        System.out.println("***** ordenacaoDosNomesEmOrdemAlfabetica *****");
        ArrayList nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Fernando");
        nomes.add("Alberto");
        nomes.add("Carlos");

        Collections.sort(nomes);

        System.out.println(nomes);
    }

}
