package ru.netology;

public class Radio {
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

    public int nextStation(int currentStation) {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
        return currentStation;
    }

    public int prevStation(int currentStation) {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
        return currentStation;
    }
}
