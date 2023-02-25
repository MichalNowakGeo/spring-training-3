package pl.sda;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MessageSender {

    private WorkDayCalculator workDayCalculator;

    public MessageSender(WorkDayCalculator workDayCalculator) {
        this.workDayCalculator = workDayCalculator;
    }

    public boolean send(String msg) {
        if (workDayCalculator.isWorkDay(LocalDate.now())) {
            System.out.println(msg);
            return true;
        }
        return false;
    }
}