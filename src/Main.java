import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("digite um cep para efetuar a busca: ");
        Scanner leitura = new Scanner(System.in);

        String cep = leitura.nextLine();
        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco endereco = consultaCep.buscacep(cep);
            System.out.println(endereco);
        } catch (Exception e){
            System.out.println(e.getMessage());
        };

    }
}