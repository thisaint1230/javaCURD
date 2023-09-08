package word;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class WordCURD {
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

}
}
