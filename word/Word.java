package word;

public class Word {
    private int id;
    private int level;
    private String english;
    private String korean;

    public Word(int id, int level, String english, String korean) {
        this.id = id;
        this.level = level;
        this.english = english;
        this.korean = korean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getKorean() {
        return korean;
    }

    public void setKorean(String korean) {
        this.korean = korean;
    }

    @Override
    public String toString() {

        String star = "";
        for(int i=0; i<level; i++) {
            star += "*";
        }
        String string = String.format("%-3s ",star)
                        +String.format("%15s ",english)
                        +String.format("\t%15s ",korean);
        return string;
    }
}
