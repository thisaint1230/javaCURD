package word;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCURD implements Interface {
    ArrayList<Word> list;
    Scanner scanner;
    WordCURD(Scanner scanner) {
        list = new ArrayList<>();
        this.scanner = scanner;
    }

    public void SaveFile(){
        try{
            FileOutputStream file = new FileOutputStream("WordMaster.txt");
            String s = "aaaaaaa" ;
            file.write(s.getBytes());
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         catch (IOException e){
            e.printStackTrace();
         }
    }

    public void LoadFile(){
        try{
            FileOutputStream file = new FileOutputStream("WordMaster.txt");
            String s = "aaaaaaa" ;
            file.write(s.getBytes());
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void AddWord(){

    }

    @Override
    public Object add() {
        System.out.println("=> 난이도 (1,2,3) 와 영어를 입력하세요");
        int level = scanner.nextInt();
        String english = scanner.nextLine();

        System.out.println("한글 뜻을 입력하세요.");
        String korean = scanner.nextLine();

        return new Word(0,level,english,korean);
    }

    @Override
    public void Search() {

    }

    @Override
    public void Update() {

    }

    @Override
    public void Delete() {

    }


    public  void addWord() {
        Word word = (Word)add();
        list.add(word);
        System.out.println("=> 단어 추가 완료!");
    }


}
