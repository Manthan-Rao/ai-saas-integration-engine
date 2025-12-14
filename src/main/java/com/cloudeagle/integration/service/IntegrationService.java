
@Service
public class IntegrationService {

    private final GenericApiClient client;
    private final TempUserRepository repo;
    private final ObjectMapper mapper = new ObjectMapper();

    public IntegrationService(GenericApiClient client, TempUserRepository repo) {
        this.client = client;
        this.repo = repo;
    }

    public void fetchCalendlyUsers(String token) throws Exception {
        String response =
            client.get("https://api.calendly.com/users/me", token);

        JsonNode node = mapper.readTree(response).get("resource");
        repo.save(UserMapper.map(node, "CALENDLY"));
    }
}
