package pl.sda;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class WorkDayCalculator {
    boolean isWorkDay(LocalDate date){
        return date.getDayOfWeek().getValue() <= 5;
    }
}
