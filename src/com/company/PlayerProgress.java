package com.company;

import java.io.Serializable;

public class PlayerProgress implements Serializable {

    int chapter;
    String mission;
    String date;
    String time;

    public PlayerProgress(int chapter, String mission, String date, String time) {
        this.chapter = chapter;
        this.mission = mission;
        this.date = date;
        this.time = time;
    }

    public int getChapter() {
        return chapter;
    }

    public String getMission() {
        return mission;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String toString () {
        return "Глава: " + chapter + ". Миссия: " + mission + ". Дата: " + date + ". Время: " + time + ".";
    }
}
