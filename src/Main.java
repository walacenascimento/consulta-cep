import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello, World!");

        ConsultaCep consultaCep = new ConsultaCep();

        Endereco endereco = consultaCep.buscacep("45656502");

        System.out.println(endereco);
    }
}