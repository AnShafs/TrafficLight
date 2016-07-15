import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Программа считывает с консоли минуту работы светофора и возвращает цвет.
 *
 * Условие:
 * Написать светофор с ООП.
 * Первые две минуты горит красный свет,
 * следующие три минуты желтый,
 * следующие четыре минуты зеленый.
 */

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите минуту:");
        TrafficLight trafficLight = new TrafficLight();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minute = getMinuteValue(reader.readLine());
        if (minute >= 0) {
            trafficLight.setMinuteOfWork(minute);
            System.out.println(trafficLight.getColor());
        }
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
