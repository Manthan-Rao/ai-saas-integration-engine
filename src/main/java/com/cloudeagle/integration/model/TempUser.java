
@Entity
@Getter @Setter
public class TempUser {
    @Id @GeneratedValue
    private Long id;
    private String email;
    private String name;
    private String source;
    @Lob
    private String rawPayload;
}
