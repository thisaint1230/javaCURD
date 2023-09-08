package word;

import word.WordManager;

public class Main {
    public static void main(String[] args) {
        WordManager wordManager = new WordManager();
        while(true) {
            int menu = wordManager.Menu();
            if (menu == 0) break;
        }


        System.out.print("=> 끝!");
        }
    }


