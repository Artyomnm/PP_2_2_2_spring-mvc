package web.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private String model;
    private int series;
    private int power;

    public Car() {
    }

    public Car(String model, int series, int power) {
        this.model = model;
        this.series = series;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", power=" + power +
                '}';
    }
}
