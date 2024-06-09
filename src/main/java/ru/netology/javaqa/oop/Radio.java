package ru.netology.javaqa.oop;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int numberStation = 10;

    public Radio() {
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setCurrentStation(int currentStation) {
        maxStation = numberStation - 1;
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        maxStation = numberStation - 1;
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        maxStation = numberStation - 1;
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setMaxStation(int numberStation) {
        maxStation = numberStation - 1;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }
}
