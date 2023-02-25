package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WorkDayCalculatorTest {

    @Test
    void checkIsNotWorkDay() {
        //given
        LocalDate now = LocalDate.of(2023, 2, 25);
        WorkDayCalculator calculator = new WorkDayCalculator();

        //when
        boolean workDay = calculator.isWorkDay(now);

        //then
        Assertions.assertFalse(workDay);
    }

    @Test
    void checkIsWorkDay() {
        //given
        LocalDate now = LocalDate.of(2023, 2, 24);
        WorkDayCalculator calculator = new WorkDayCalculator();

        //when
        boolean workDay = calculator.isWorkDay(now);

        //then
        Assertions.assertTrue(workDay);
    }
}