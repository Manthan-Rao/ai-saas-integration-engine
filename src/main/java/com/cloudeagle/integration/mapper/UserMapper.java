
public class UserMapper {
    public static TempUser map(JsonNode node, String source) {
        TempUser u = new TempUser();
        u.setEmail(node.get("email").asText());
        u.setName(node.get("name").asText());
        u.setSource(source);
        u.setRawPayload(node.toString());
        return u;
    }
}
