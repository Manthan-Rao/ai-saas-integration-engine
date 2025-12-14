
@Component
public class GenericApiClient {

    private final WebClient webClient;

    public GenericApiClient(WebClient.Builder builder) {
        this.webClient = builder.build();
    }

    public String get(String url, String token) {
        return webClient.get()
                .uri(url)
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
