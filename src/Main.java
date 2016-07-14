import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AnShafs on 10.07.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите минуту:");
        TrafficLight trafficLight = new TrafficLight();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minute = getMinuteValue(reader.readLine());
        if (minute >= 0)
            System.out.println(trafficLight.getColorForMinute(minute));
        else
            System.out.println("Введено некорректное значение.");
    }

    public static double getMinuteValue(String value){
        double minute = 0.0;
        try {
            minute = Double.parseDouble(value);
            if (minute < 0) return -1;
        } catch (Exception e) {
            return -1;
        }
        return minute;
    }
}
