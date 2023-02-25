package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {

    @Test
    void send() {
        WorkDayCalculator calculator = new WorkDayCalculator();
        MessageSender messageSender = new MessageSender(calculator);
        boolean isSend = messageSender.send("Hello world");
        Assertions.assertFalse(isSend);
    }
}