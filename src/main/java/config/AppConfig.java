package config;

import deth.Island;
import deth.Ocean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public Island getIsland() {
        return new Island();
    }
}
