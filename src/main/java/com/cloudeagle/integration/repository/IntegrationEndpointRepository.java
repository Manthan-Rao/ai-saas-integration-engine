
public interface IntegrationEndpointRepository
        extends JpaRepository<IntegrationEndpoint, Long> {
    IntegrationEndpoint findByIntegrationIdAndName(Long id, String name);
}
