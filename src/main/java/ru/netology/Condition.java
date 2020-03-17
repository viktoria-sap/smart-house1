package ru.netology;

public class Condition {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private int increaseCurrentTemperature;
    private int decreaseCurrentTemperature;
    private boolean on;


    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getIncreaseCurrentTemperature() {
        return increaseCurrentTemperature;
    }

    public void setIncreaseCurrentTemperature(int increaseCurrentTemperature) {
        if (increaseCurrentTemperature < currentTemperature) {
            return;
        }
        if (increaseCurrentTemperature > maxTemperature) {
            return;
        }
        currentTemperature += 1;
        this.increaseCurrentTemperature = currentTemperature;
    }

    public int getDecreaseCurrentTemperature() {
        return decreaseCurrentTemperature;
    }

    public void setDecreaseCurrentTemperature(int decreaseCurrentTemperature) {
        if (decreaseCurrentTemperature > currentTemperature) {
            return;
        }
        if (decreaseCurrentTemperature < minTemperature) {
            return;
        }
        currentTemperature -= 1;
        this.decreaseCurrentTemperature = currentTemperature;
    }


    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
}
