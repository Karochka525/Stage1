package Part_3.Task4;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Diary {
    private final HashSet<BusinessRecord> businessRecords = new HashSet<>();

    private BusinessRecord chooseRecordFromList(List<BusinessRecord> set){
        Scanner sc = new Scanner(System.in);
        int recordIndex;
        System.out.println("Найдено несколь записей, выберите нужную:");
        int index = 0;
        for (BusinessRecord record:set) {
            index++;
            System.out.println(index+") "+ record);
        }
        while (!sc.hasNextInt() || ((recordIndex = sc.nextInt()) < 1 || recordIndex > set.size())){
            System.out.println("Некореектное число, должно быть число то 1 до "+set.size());
        }
        return set.get(recordIndex-1);
    }

    public BusinessRecord searchByDateTime(LocalDateTime dateTime){
        List<BusinessRecord> searchResult = businessRecords.stream()
                .filter(record -> dateTime.truncatedTo(ChronoUnit.SECONDS)
                        .isEqual(record.getCreateWhen()))
                .collect(Collectors.toList());

        if (!searchResult.isEmpty()) {
            if (searchResult.size() > 1) {
                return chooseRecordFromList(searchResult);
            } else {
                return searchResult.get(0);
            }
        }
        System.out.println("Ничего не найдено\n");
        return null;
    }

    public boolean add(BusinessRecord record) {
        return businessRecords.add(record);
    }

    public boolean delete(LocalDateTime dateTime){
        BusinessRecord searchResult = searchByDateTime(dateTime);
        System.out.println("Удалние записи:" + searchResult + "\n");
        return businessRecords.remove(searchResult);
    }

    public void correct(LocalDateTime dateTime){
        Scanner scanner = new Scanner(System.in);
        BusinessRecord searchResult = searchByDateTime(dateTime);
        if (Objects.nonNull(searchResult)) {
            System.out.println("Введите скорректированную запись:");
            searchResult.setWordsByStringArr(scanner.nextLine().split(" "));
            System.out.println("Запись скорректирована!\n");
        }
    }

    public void showAll(boolean asc){
        if (asc) {
            businessRecords.stream()
                    .sorted(Comparator.comparing(BusinessRecord::getCreateWhen))
                    .forEach(System.out::println);
        } else {
            businessRecords.stream()
                    .sorted(Comparator.comparing(BusinessRecord::getCreateWhen).reversed())
                    .forEach(System.out::println);
        }
        System.out.println();
    }

    public BusinessRecord showByDateTime(LocalDateTime dateTime){
        BusinessRecord searchResult = searchByDateTime(dateTime);
        if (Objects.nonNull(searchResult)) {
            System.out.println(searchResult+"\n");
        }
        return searchResult;
    }

    public BusinessRecord showLast(){
        BusinessRecord lastRecord = businessRecords.stream()
                .max(Comparator.comparing(BusinessRecord::getCreateWhen))
                .get();
        System.out.println("Последняя запись:\n"+lastRecord+"\n");
        return lastRecord;
    }
}
