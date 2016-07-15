public class TrafficLight {
    final int RED_TIME = 2;
    final int YELLOW_TIME = 3;
    final int GREEN_TIME = 4;

    private double minuteOfWork;
    private String color;

    public TrafficLight(){
        minuteOfWork = 0;
        updateColor();
    }

    public void setMinuteOfWork(double minuteOfWork) {
        int timeCycle;
        timeCycle = GREEN_TIME + YELLOW_TIME + RED_TIME;
        while (minuteOfWork > timeCycle) {
            minuteOfWork = minuteOfWork%timeCycle;
        }
        if (minuteOfWork > 0)
            this.minuteOfWork = minuteOfWork;
        else
            this.minuteOfWork = 0;
    }

    public String getColor() {
        updateColor();
        return color;
    }

    public void updateColor() {
        if (minuteOfWork <= RED_TIME)
            color = "Красный";
        else if (minuteOfWork <= (RED_TIME + YELLOW_TIME))
            color = "Желтый";
        else color = "Зеленый";
    }
}
