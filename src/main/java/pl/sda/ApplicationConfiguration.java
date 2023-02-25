package pl.sda;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("pl")
@PropertySource("application.properties")
@Import(DatabaseConfiruration.class)
public class ApplicationConfiguration {

    @Bean
    public CalculatorBo calculatorBo() {
        return new CalculatorBo();
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}