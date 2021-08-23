package TemperatureMeteoApp;

public class Main {
    public static void main(String[]args){
        OpenMeteoProvider app = new OpenMeteoProvider(0);
        PrivateMeteoProvider appPrivate = new PrivateMeteoProvider(0);
        app.getCurrentTemperature(498);
        appPrivate.getCurrentHumidity(36);

    }
}
