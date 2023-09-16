package word;

import java.util.ArrayList;
import java.util.Scanner;

public class WordProgram {
    Scanner scanner = new Scanner(System.in);
    WordFile wordFile = new WordFile();


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
        wordFile.loadFile();
        while (true) {
            int menu = Menu();
            switch (menu) {
                case 1 -> ShowList();
                case 2 -> ShowLevelList();
                case 3 -> {searchWord();
                }
                case 4 -> wordFile.addWord();
                case 5 -> {updateWord();
                }
                case 6 -> {deleteWord();
                }
                case 7 -> {wordFile.saveFile();
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
        if(wordFile.list.isEmpty()){
        System.out.println("아직 단어가 없습니다. 추가해 주세요");
        }
        else {
            for (int i = 0; i < wordFile.list.size(); i++) {
                System.out.println((i + 1) + "\t" + wordFile.list.get(i).toString());
            }
        }
        System.out.println("--------------------------------------");
    }
    public ArrayList<Integer> ShowList (String keyword){
        ArrayList<Integer> idList = new ArrayList<>();
        System.out.println("--------------------------------------");
        int j=0;
        if(wordFile.list.isEmpty()){
            System.out.println("아직 단어가 없습니다. 추가해 주세요");
        }
        else {
            for (int i = 0; i < wordFile.list.size(); i++) {
                String word = wordFile.list.get(i).getEnglish();
                if(!word.contains(keyword)) continue;
                System.out.println((j + 1) + "\t" + wordFile.list.get(i).toString());
                idList.add(i);
                j++;
            }
        }
        System.out.println("--------------------------------------");
        return idList;
    }
    public void ShowLevelList(){
        System.out.println("=> 레벨을 입력하세요! ( 1 2 3 ) ");
        int level = scanner.nextInt();
        while(!((1<=level)&&(level<=3))){
            System.out.println("잘못 입력하셨습니다 다시 입력하세요 !");
            level = scanner.nextInt();
        };

        System.out.println("--------------------------------------");

        if(wordFile.list.isEmpty()){
            System.out.println("아직 단어가 없습니다. 추가해 주세요");
        }
        else {
            for (int i = 0; i < wordFile.list.size(); i++) {
                if (level == wordFile.list.get(i).getLevel()) {
                    System.out.println((i + 1) + "\t" + wordFile.list.get(i).toString());
                }
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("=> 완료!");
    }
    public void updateWord() {
        System.out.print("=> 수정할 단어 검색 : ");
        String keyword = scanner.next();
        ArrayList<Integer> idlist = this.ShowList(keyword);
        System.out.print("=> 수정할 번호 검색 : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("=> 한글 입력 : ");
        String korean = scanner.nextLine();
        Word word = wordFile.list.get(idlist.get(id-1));
        word.setKorean(korean);
        System.out.println("단어 수정 완료!");

    }

    private void deleteWord () {

        System.out.print("=> 삭제할 단어 검색 : ");
        String keyword = scanner.next();
        ArrayList<Integer> idlist = this.ShowList(keyword);

        System.out.print("=> 삭제할 번호 검색 : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        wordFile.list.remove((int)idlist.get(id-1));
        System.out.println("단어 삭제 완료!");
    }
    public void searchWord() {
        System.out.println("=> 원하는 단어를 입력하세요");
        String search = scanner.next();
        ShowList(search);
    }


}
