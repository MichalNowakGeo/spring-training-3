package pl.sda;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("helloWorldBoImpl")
@Primary
public class HelloWorldBoImpl implements HelloWorldBo {

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}