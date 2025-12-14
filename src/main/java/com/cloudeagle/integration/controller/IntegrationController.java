
@RestController
@RequestMapping("/integrations")
public class IntegrationController {

    private final IntegrationService service;

    public IntegrationController(IntegrationService service) {
        this.service = service;
    }

    @PostMapping("/CALENDLY/users")
    public String fetch(@RequestHeader("Authorization") String auth)
            throws Exception {
        service.fetchCalendlyUsers(auth.replace("Bearer ", ""));
        return "SUCCESS";
    }
}
