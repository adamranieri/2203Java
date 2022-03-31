package tdd;

// 1. design our interface
public interface TemperatureConverter {


    double farenheitToCelcius(double temp);
    double celciusToFarenheit(double temp);

    double convertTemp(double temp, String from, String to);


}
