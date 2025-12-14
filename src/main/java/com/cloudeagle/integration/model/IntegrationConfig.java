
@Entity
@Getter @Setter
public class IntegrationConfig {
    @Id @GeneratedValue
    private Long id;
    private String appName;
    private String baseUrl;
    private String authType;
}
