package Part_2.Taks_5;

import java.util.Objects;

public class Sentence {
    private Word[] words;

    public Sentence(String[] originalStr) {
        setWordsByStringArr(originalStr);
        System.out.println("Модель создана!");
    }

    public void setWordsByStringArr(String[] sentence) {
        words = new Word[sentence.length];
        for (int i = 0; i < words.length; i++) {
            words[i] = (Objects.nonNull(sentence[i]))
                    ? new Word(sentence[i])
                    : new Word("");
        }
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
