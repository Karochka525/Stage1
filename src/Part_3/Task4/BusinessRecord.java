package Part_3.Task4;

import Part_2.Taks_5.Sentence;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class BusinessRecord extends Sentence {
    private LocalDateTime executeDate;
    private final LocalDateTime createWhen;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public BusinessRecord(String[] originalStr) {
        super(originalStr);
        createWhen = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
    }

    public String getExecuteDate() {
        return executeDate.format(formatter);
    }

    public void setExecuteDate(LocalDateTime executeDate) {
        this.executeDate = executeDate;
    }

    public String getStrCreateWhen() {
        return createWhen.format(formatter);
    }

    public LocalDateTime getCreateWhen() {
        return createWhen;
    }

    @Override
    public String toString() {
        return this.getStrCreateWhen() + " - " + this.getOriginalSentence();
    }
}
