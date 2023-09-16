package word;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFile implements Interface {
    ArrayList<Word> list;
    Scanner scanner = new Scanner(System.in);

    WordFile() {
        list = new ArrayList<>();
        this.scanner = scanner;
    }

    public void saveFile(){
        try{
            FileOutputStream file = new FileOutputStream("WordMaster.txt");
            for (int i=0; i< list.size(); i++) {
                file.write(list.get(i).dataWrite().getBytes());
            }
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         catch (IOException e){
            e.printStackTrace();
         }
    }

    public void loadFile(){
        try{
            BufferedReader bufferedReader = new BufferedReader( new FileReader("WordMaster.txt"));
            String line;
            int i=0;
            while (true){
                line = bufferedReader.readLine();
                if(line == null) break;
                String[] data = line.split("\\|");
                try {
                    list.add(new Word(0,Integer.parseInt(data[0]),data[1],data[2]));
                }
                catch (NumberFormatException e){}

                i++;
            }

            bufferedReader.close();
            System.out.println("=>"+i+"개 불러옴!");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
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
