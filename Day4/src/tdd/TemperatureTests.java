package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

// 1. So long as the Test method finishes without throwing an exception as test is considered passed
// 2. Assertions are just methods that throw an exception if the assertion is false
// 3. All Test methods are VOID. That is a JUnit thing.

// TDD is more than just seeing if your code works
// they are instrumental in DESIGNING your applications

public class TemperatureTests {

    TemperatureConverter converter = new TempConverterImpl();

    @Test
    void celcius_to_farenheit(){ // only acceptable use case of underscores in Java
        double result = this.converter.celciusToFarenheit(100);
        Assertions.assertEquals(212, result, 0.1);// by how much it can be off
    }

    @Test
    void farenheit_to_celcius(){
        double result = this.converter.farenheitToCelcius(212);
        Assertions.assertEquals(100,result, 0.1);
    }

    @Test // negative test. makes sures something fails appropriately
    void absolute_Zero_raises_exception(){
        Assertions.assertThrows(RuntimeException.class, ()->{
            this.converter.celciusToFarenheit(-400);
        });
    }

    @Test
    void kelvin_celcius(){
        // do we care if it is case sensitive?
        // what do we do if it mispelled?
        // should we allow the letter k,s,c to indicate temperature?
        double result = this.converter.convertTemp(100,"kelvin", "celcius");
        Assertions.assertEquals(-173.15,result);
    }

    @Test
    void case_insensitive(){
        double result = this.converter.convertTemp(100,"KeLVin", "cElcIus");
        Assertions.assertEquals(-173.15,result);
    }

}
