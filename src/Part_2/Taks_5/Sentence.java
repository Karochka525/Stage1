package Part_2.Taks_5;

import java.util.Objects;

public class Sentence {
    private final Word[] words;

    public Sentence(String[] originalStr) {
        words = new Word[originalStr.length];
        for (int i = 0; i < originalStr.length; i++) {
            words[i] = (Objects.nonNull(originalStr[i]))
                    ? new Word(originalStr[i])
                    : new Word("");
        }
        System.out.println("Модель создана!");
    }
    public int getWordsCount(){
        return  words.length;
    }

    public Word getWordByPosition(int pos) {
        if (words.length <= pos || pos > 0) {
            return words[pos-1];
        } else {
            return null;
        }
    }

    public String getOriginalSentence() {
        StringBuilder origSentence = new StringBuilder();
        for (Word word:words) {
            origSentence.append(word.getOriginalWord()).append(" ");
        }
        return origSentence.toString();
    }
}
