package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        HelloWorldBo helloWorldBo = context.getBean(HelloWorldBo.class);
        helloWorldBo.print("Hello world !!!");

        CalculatorBo calculatorBo = context.getBean(CalculatorBo.class);
        System.out.println(calculatorBo.add(1, 2));

        ApplicationPropertyReader applicationPropertyReader = context.getBean(ApplicationPropertyReader.class);
        System.out.println(applicationPropertyReader);

        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.send("hello world");

    }
}