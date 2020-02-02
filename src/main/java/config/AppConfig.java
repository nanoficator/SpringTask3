package config;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;
import deth.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sun.font.CreatedFontTracker;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public KoscheiTheDeathless koscheiTheDeathless() {
        return new KoscheiTheDeathless();
    }

    @Bean
    public Island getIsland() {
        return new Island();
    }

    @Bean
    public Ocean ocean() {
        return new Ocean();
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
}