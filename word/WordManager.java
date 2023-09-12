package word;

import java.util.Scanner;

public class WordManager {
    Scanner scanner = new Scanner(System.in);
    WordCURD wordCURD;
    WordManager(){
        wordCURD= new WordCURD(scanner);
    }

    public int Menu() {
    System.out.print("   *** 영단어 마스터 *** \n "
    + " ******************** \n "
    + " 1. 모든 단어 보기 \n "
    + " 2. 수준별 단어 보기 \n "
    + " 3. 단어 검색 \n "
    + " 4. 단어 추가 \n "
    + " 5. 단어 수정 \n "
    + " 6. 단어 삭제 \n "
    + " 7. 파일 저장 \n "
    + " 0. 나가기 \n "
    + " ******************** \n "
    + " => 원하는 메뉴는? "
    );
       return scanner.nextInt();
    }

    public void program(){
        while (true) {
            int menu = Menu();
            switch (menu) {
                case 1 -> ShowList();
                case 2 -> ShowLevelList();
                case 3 -> {
                }
                case 4 -> wordCURD.addWord();
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                case 0 -> {
                    System.out.println("\n => 프로그램 종료 ! ");
                    return;
                }
                default -> System.out.println("\n => 번호를 올바르게 입력! \n");
            }

        }
    }
    public void ShowList (){

        System.out.println("--------------------------------------");
        if(wordCURD.list.isEmpty()){
        System.out.println("아직 단어가 없습니다. 추가해 주세요");
        }
        else {
            for (int i = 0; i < wordCURD.list.size(); i++) {
                System.out.println((i + 1) + "\t" + wordCURD.list.get(i).toString());
            }
        }
        System.out.println("--------------------------------------");
    }
    public void ShowLevelList(){
        System.out.println("=> 레벨을 입력하세요! ( 1 2 3 ) ");
        int level = scanner.nextInt();
        while(!((1<=level)&&(level<=3))){
            System.out.println("잘못 입력하셨습니다 다시 입력하세요 !");
            level = scanner.nextInt();
        };

        System.out.println("--------------------------------------");

        if(wordCURD.list.isEmpty()){
            System.out.println("아직 단어가 없습니다. 추가해 주세요");
        }
        else {
            for (int i = 0; i < wordCURD.list.size(); i++) {
                if (level == wordCURD.list.get(i).getLevel()) {
                    System.out.println((i + 1) + "\t" + wordCURD.list.get(i).toString());
                }
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("=> 완료!");

    }


}
