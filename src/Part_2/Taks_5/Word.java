package Part_2.Taks_5;

public class Word {
    private char[] word;

    public Word(String word) {
        this.word = word.toCharArray();
    }

    public int getSymbolCount() {
        return  word.length;
    }

    public String getOriginalWord() {
        return new String(word);
    }
}

