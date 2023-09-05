import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WordManager wordManager = new WordManager();

        while(true) {
            int menu=wordManager.Menu();
            if(menu==0) break;         //" 0. 나가기 \n "
            if(menu==1);            //" 1. 모든 단어 보기 \n "
            if(menu==2);                // " 2. 수준별 단어 보기 \n "
            if(menu==3);                 //" 3. 단어 검색 \n "
            if(menu==4);                  //" 4. 단어 추가 \n "
            if(menu==5);                    //" 5. 단어 수정 \n "
            if(menu==6);                               //" 6. 단어 삭제 \n "
            if(menu==7);                              //" 7. 파일 저장 \n "





        }
    }

}
