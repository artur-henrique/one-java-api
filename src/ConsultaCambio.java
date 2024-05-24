import com.google.gson.Gson;

import javax.swing.event.MenuDragMouseEvent;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambio {
    public ConversionRate buscaMoeda(String moedaBase) {
        String API_KEY = "dfc66c9f7f780ae7bd8aa2ac";

        // Alterar sufixo da URI
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaBase);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConversionRate.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível consultar valores de câmbio");
        }

    }
}
