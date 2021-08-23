package TemperatureMeteoApp;
import java.util.Random;

public class OpenMeteoProvider {
    private int countryCode;
        public OpenMeteoProvider(int countryCode){
            this.countryCode = countryCode;
        }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public double getCurrentTemperature(int countryCode){

            switch (countryCode){
                case 36:
                    System.out.println("The temperature of Australia is: " + getTemperature(-50, 50) + "°C");
                    break;
                case 76:
                    System.out.println("The temperature of Brazil is: " + getTemperature(-50, 50) + "°C");
                    break;
                case 246:
                    System.out.println("The temperature of Finland is: " + getTemperature(-50, 50) + "°C");
                    break;
                case 484:
                    System.out.println("The temperature of Mexico is: " + getTemperature(-50, 50) + "°C");
                    break;
                case 498:
                    System.out.println("The temperature of Moldova is: " + getTemperature(-50, 50) + "°C");
                    break;
                default:
                    System.err.println("Can't provide data for this country!");

            }
        /*if (countryCode == 36) {
            System.out.println("The temperature of Australia is: " + getTemperature(-50, 50) + "°C");
        } else  {
            System.err.println("Can't provide data for this country!");
        }*/
        return countryCode;
    }

    private static int getTemperature(int minTemperature, int maxTemperature) {
        Random randomNumber = new Random();
        if(minTemperature>=maxTemperature){
            System.err.println("Max temperature should be greater then minimum");
        }

        return randomNumber.nextInt((maxTemperature - minTemperature) + 1) + minTemperature;
    }

}
