package ru.netology;

public class Radio {
    public int decreaseAudio(int currentVolume) {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else if (currentVolume > 0) {
            currentVolume--;
        }
        return currentVolume;
    }

    public int increaseAudio(int currentVolume) {
        if (currentVolume == 100) {
            currentVolume = 100;
        } else if (currentVolume < 100) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int nextStation(int currentStation) {
        if (currentStation == 9) {
            currentStation = 0;
        } else if (currentStation < 9) {
            currentStation++;
        }
        return currentStation;
    }

    public int prevStation(int currentStation) {
        if (currentStation == 0) {
            currentStation = 9;
        } else if (currentStation > 0) {
            currentStation--;
        }
        return currentStation;
    }
}
