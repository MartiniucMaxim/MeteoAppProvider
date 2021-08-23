package TemperatureMeteoApp;

import java.util.Random;

public class PrivateMeteoProvider extends OpenMeteoProvider{

    public PrivateMeteoProvider(int countryCode) {
        super(countryCode);
    }

    public double getCurrentHumidity(int countryCode){
        switch(countryCode){
            case 36:
                System.out.println("The humidity of Australia is: " + getHumidity() + "%");
                break;
            case 76:
                System.out.println("The humidity of Brazil is: " + getHumidity() + "%");
                break;
            case 246:
                System.out.println("The humidity of Finland is: " + getHumidity() + "%");
                break;
            case 484:
                System.out.println("The humidity of Mexico is: " + getHumidity() + "%");
                break;
            case 498:
                System.out.println("The humidity of Moldova is: " + getHumidity() + "%");
                break;
            default:
                System.err.println("Can't provide data for this country!");
        }
        return countryCode;
    }

    public int getHumidity(){
        return (int)(Math.random()*100);

    }
}
