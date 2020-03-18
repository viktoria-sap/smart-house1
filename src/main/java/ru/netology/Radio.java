package ru.netology;

public class Radio {

    private int maxStation;
    private int minStation;
    private int numberCurrentStation;
    private int nextStation;
    private int prevStation;
    boolean next;
    boolean prev;

    public boolean isNext(boolean b) {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public boolean isPrev(boolean b) {
        return prev;
    }

    public void setPrev(boolean prev) {
        this.prev = prev;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int numberCurrentStation) {
        this.numberCurrentStation = numberCurrentStation;
    }

    public int getNextStation() {
        return nextStation;
    }

    public void setNextStation(int nextStation) {
        if (isPrev(true)) {
            return;
        }
        numberCurrentStation += 1;
        if (numberCurrentStation > maxStation) {
            numberCurrentStation = 0;
        }
        this.nextStation = numberCurrentStation;
    }

    public int getPrevStation() {
        return prevStation;
    }

    public void setPrevStation(int prevStation) {
        if (isNext(true)) {
            return;
        }
        numberCurrentStation -= 1;
        if (numberCurrentStation < minStation) {
            numberCurrentStation = 9;
        }
        this.prevStation = numberCurrentStation;
    }

}