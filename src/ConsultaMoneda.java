import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
  public CambioMoneda buscarCambioMoneda(String base_code, String target_code){
    URI direccion = URI
        .create("https://v6.exchangerate-api.com/v6/9bce258dc53e32151b2e03ae/pair/"
            +base_code+"/"+target_code);
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(direccion)
        .build();

    try{
      HttpResponse<String> response = client
          .send(request, HttpResponse.BodyHandlers.ofString());
      return new Gson().fromJson(response.body(), CambioMoneda.class);
    }catch (Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

}
