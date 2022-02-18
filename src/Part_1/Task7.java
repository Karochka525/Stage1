package Part_1;

public class Task7 {
    public static String getDayAddition(int num) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return "бутылок стояло";
        }
        switch (num % 10) {
            case 1:
                return "бутылка стояла";
            case 2:
            case 3:
            case 4:
                return "бутылки стояли";
            default:
                return "бутылок стояло";
        }
    }
    public static void print(){
       String str="на столе, одна из них упала и разбилась.";
        for (int i = 100; i > 0; i--) {
          String str1= getDayAddition(i);
            System.out.println(i+" "+str1+" "+str);
        }
        System.out.println("Все бутылки разбились :(");

    }
}
