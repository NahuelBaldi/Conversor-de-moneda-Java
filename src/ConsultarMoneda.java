import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public Monedas buscarMonedas(String monedaBase, String monedaTarget){

        URI direction = URI.create("https://v6.exchangerate-api.com/v6/ecbb3f9cea02d26906d24891/pair/"+monedaBase+"/"+monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direction)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Monedas.class);
        }catch (Exception e){
            throw new RuntimeException("No encontré el tipo de moneda");
        }
    }
}
