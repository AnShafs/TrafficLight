/**
 * класс Светофор
 * содержит константы обозначающие сколько горит тот или иной цвет в минутах
 * параметры минуты работы в цикле и цвет
 * возвращает цвет в зависисмости от минуты работы
 */

public class TrafficLight {
    final int RED_TIME = 2;
    final int YELLOW_TIME = 3;
    final int GREEN_TIME = 4;

    private double minuteOfCycle;
    private String color;

    public TrafficLight(){
        minuteOfCycle = 0;
        updateColor();
    }

    /**
     * метод записывает минутут работы в цикле
     * цикл это время за которое прогорят все цвета светофора
     * @param minuteOfWork
     */

    public void setMinuteOfCycle(double minuteOfWork) {
        int timeCycle;
        timeCycle = GREEN_TIME + YELLOW_TIME + RED_TIME;
        while (minuteOfCycle > timeCycle) {
            minuteOfCycle = minuteOfCycle %timeCycle;
        }
        if (minuteOfCycle > 0)
            this.minuteOfCycle = minuteOfCycle;
        else
            this.minuteOfCycle = 0;
    }

    public String getColor() {
        updateColor();
        return color;
    }

    /**
     * метод обновляет цвет в зависимости от минуты работы светофора
     */

    private void updateColor() {
        if (minuteOfCycle <= RED_TIME)
            color = "Красный";
        else if (minuteOfCycle <= (RED_TIME + YELLOW_TIME))
            color = "Желтый";
        else color = "Зеленый";
    }
}
