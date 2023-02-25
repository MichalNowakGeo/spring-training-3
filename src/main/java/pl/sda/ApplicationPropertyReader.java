package pl.sda;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class ApplicationPropertyReader {

    @Value("${database.username}")
    private String databaseUser;

    @Value("${database.password}")
    private String databasePassword;
}