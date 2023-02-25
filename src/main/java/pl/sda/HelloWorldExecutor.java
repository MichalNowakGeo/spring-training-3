package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldExecutor {

    private HelloWorldBo helloWorldBo;

    @Autowired
    public HelloWorldExecutor(@Qualifier("helloWorldBoImpl") HelloWorldBo helloWorldBo) {
        this.helloWorldBo = helloWorldBo;
    }
}