package com.company;

import java.io.*;

public class Main {

    private static final String PLAYERPROGRESS_FILENAME = "playerProgress.data";

    public static void main(String[] args) {

             final PlayerProgress myPG = new PlayerProgress(1, "Др. Фримен", "01.05.2022", "03:00");
                 saveProgress(myPG);

       final PlayerProgress PG = loadProgress();
  //     System.out.printf("Глава: %d . Миссия: %s . Дата: %s. Время: %s\n",
  //             PG.getChapter(),
  //             PG.getMission(),
  //             PG.getDate(),
  //             PG.getTime());
        System.out.println(PG);
    }

    public static boolean saveProgress(PlayerProgress playerProgress) {
        try (FileOutputStream fos = new FileOutputStream(PLAYERPROGRESS_FILENAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(playerProgress);
            return true;
        } catch (IOException er) {
            return false;
        }

    }


    public static PlayerProgress loadProgress() {
        try (
                FileInputStream fis = new FileInputStream(PLAYERPROGRESS_FILENAME);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            final Object obj = ois.readObject();
            PlayerProgress result = (PlayerProgress) obj;
            return result;
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}

