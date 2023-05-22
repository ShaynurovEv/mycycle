package ru.netology.javaqa.mycycle.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void testOne(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();
        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

  //  @Test
   // public void testTwo() {
       // RestService service = new RestService();
      //  int expected = 2;
     //   int actual = service.calculate(100_000, 60_000, 150_000);
     //   Assertions.assertEquals(expected, actual);
    //}
}
