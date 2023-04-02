package cz.upce.bspwe.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"cz.upce.bspwe.db.entity"})
@EnableJpaRepositories(basePackages = {"cz.upce.bspwe.db.repository"})
public class DataConfiguration {
}