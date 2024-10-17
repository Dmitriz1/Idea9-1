package ru.netology;

public class Radio {
    private int currentStation;
    private int numberOfStations;

    public Radio() {
        this.numberOfStations = 10;
        this.currentStation = 0;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.currentStation = numberOfStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        this.currentStation = station;
    }

    public int decreaseAudio(int currentVolume) {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }
        return currentVolume;
    }

    public int increaseAudio(int currentVolume) {
        if (currentVolume == 100) {
            currentVolume = 100;
        } else {
            currentVolume++;
        }
        return currentVolume;
    }

    public int nextStation() {
        currentStation = (currentStation + 1) % numberOfStations;
        return currentStation;
    }

    public int prevStation() {
        currentStation = (currentStation - 1 + numberOfStations) % numberOfStations;
        return currentStation;
    }


}