package ru.netology.javaqa.restprojectmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
    @Test
    public void CalculateTheNumberOfMonthsForRest() {
        RestService service = new RestService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void HowMuchRestMonth() {
        RestService service = new RestService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(2, actual);
    }
}