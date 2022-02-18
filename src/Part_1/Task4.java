package Part_1;

public class Task4 {
    public static void printRandomArray(){
        int[] myArray=new int[30];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]= (int) (Math.random() * 10);
            System.out.print(myArray[i]+" ");
            if((i+1)%10==0){
                System.out.println();
            }
        }

    }
}
