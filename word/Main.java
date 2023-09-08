package word;

import word.WordManager;

public class Main {
    public static void main(String[] args) {
        WordManager wordManager = new WordManager();
        WordCURD a = new WordCURD();
        while (true) {
            int menu = wordManager.Menu();
            switch (menu) {
                case 1: wordManager.ShowList();
                    break;
                case 2: wordManager.ShowLevelList();
                    break;
                case 3: wordManager.SearchWord();
                    break;
                case 4: wordManager.AddWord();
                    break;
                case 5: wordManager.ModifyWord();
                    break;
                case 6: wordManager.DeleteWord();
                    break;
                case 7: a.SaveFile();
                    break;
                case 0:
                    System.out.println("\n => 프로그램 종료 ! ");
                    return;

                default:
                    System.out.println("\n => 번호를 올바르게 입력! \n");

            }

        }
    }
}







