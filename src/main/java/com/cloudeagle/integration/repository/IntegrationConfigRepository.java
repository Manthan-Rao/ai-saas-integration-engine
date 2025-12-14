
public interface IntegrationConfigRepository
        extends JpaRepository<IntegrationConfig, Long> {
    Optional<IntegrationConfig> findByAppName(String appName);
}
