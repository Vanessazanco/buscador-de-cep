import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        BuscadorDeCep consultaCep = new BuscadorDeCep();
        System.out.println("Digite um número de CEP para consulta : ");
        String cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco("01001000");
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.geraJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}
