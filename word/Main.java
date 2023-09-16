package word;

import word.WordProgram;

public class Main {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println("OS name : " + osName);

        new WordProgram().program();
    }
}







