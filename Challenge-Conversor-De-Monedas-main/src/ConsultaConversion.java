import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {

    public Conversion hacerConversion(String origen, String destino, double monto){
        URI direccion = URI
                .create("https://v6.exchangerate-api.com/v6/4e6e29df5dea27427c6dd7d9/pair/"
                        +origen+"/"+destino+"/"+monto);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(direccion)
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e){
            throw new RuntimeException("No se pudo hacer la conversión");
        }
    }

}
