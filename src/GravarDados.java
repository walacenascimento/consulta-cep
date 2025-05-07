import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GravarDados {
    public void gerarArquivoJson(Endereco endereco) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter arquivoJson = new FileWriter(endereco.cep() + ".json");
        arquivoJson.write(gson.toJson(endereco));
        arquivoJson.close();
    }
}
