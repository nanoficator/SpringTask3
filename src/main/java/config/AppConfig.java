package config;

import deth.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public Ocean ocean() {
        return new Ocean();
    }

    @Bean
    public Island island() {
        return  new Island();
    }

    @Bean
    public Oak oak() {
        return new Oak();
    }

    @Bean
    public Chest chest() {
        return new Chest();
    }

    @Bean
    public Rabbit rabbit() {
        return new Rabbit();
    }

    @Bean
    public Duck duck() {
        return new Duck();
    }

    @Bean
    public Egg egg() {
        return new Egg();
    }

    @Bean
    public Needle needle() {
        return new Needle();
    }

    @Bean
    public Deth deth() {
        return new Deth();
    }

    @Bean
    public KoscheiTheDeathless koscheiTheDeathless() {
        return new KoscheiTheDeathless();
    }
}
