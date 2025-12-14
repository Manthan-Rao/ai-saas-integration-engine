
@Entity
@Getter @Setter
public class IntegrationEndpoint {
    @Id @GeneratedValue
    private Long id;
    private Long integrationId;
    private String name;
    private String path;
    private String httpMethod;
    @Lob
    private String responseMapping;
}
