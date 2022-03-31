package tdd;

public class TempConverterImpl implements TemperatureConverter{

    @Override
    public double farenheitToCelcius(double temp) {
        double celcius = (temp-32)*5/9;
        return celcius;
    }

    @Override
    public double celciusToFarenheit(double temp) {
        if(temp <= 273.15){
            throw  new RuntimeException("Input was below absolute zero");
        }
        double f = (9d/5d*temp) + 32;
        return f;
    }

    @Override
    public double convertTemp(double temp, String from, String to) {
        return 0;
    }
}
