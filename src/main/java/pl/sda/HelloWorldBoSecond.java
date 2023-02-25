package pl.sda;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBoSecond implements HelloWorldBo {
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}