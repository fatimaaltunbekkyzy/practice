import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     /*   Random random = new Random();
        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {//массивди толтуруу
            massive[i] = random.nextInt(1, 25);
        }
        for (int element : massive) {//массивди экранга чыгаруу
            System.out.println(element + " ");
        }
        for (int i = 0; i < massive.length; i++) {//  массивди сорттоо:осуу тартибинде
            for (int j = i + 1; j < massive.length; j++) {
                if (massive[i] > massive[j]) {
                    int ybaktyluu = massive[i];
                    massive[i] = massive[j];
                    massive[j] = ybaktyluu;
                }
            }
        }
        System.out.println("Осуу тартибиндеги массив: ");
        for (int element : massive) {
            System.out.println(element + " ");
        }
        System.out.println("Кемуу тартибинде");
        for (int i = massive.length - 1; i >= 0; i--) {
            System.out.println(massive[i] + " ");
          */


  /*      //Task8
        Random random = new Random();
        int[] massive = new int[11];

        for (int i = 0; i < massive.length; i++) {//массивдерди случайный сандар менен толтуруу.
            massive[i] = random.nextInt(3) - 1;//-1, же 0 ,же 1
        }
        //Массивди экранга чыгаруу
        System.out.println("Массив");
        for (int element : massive) {
            System.out.println(element + " ");
            // for(int элемент : massive){

        }
        System.out.println();
//элементтердин саны
        int maxSan = 0;
        int kopKezdeshkenElement = 0;
        boolean kopElementTapkan = false;// коп элемент тапканда жалган деп чыксын

        for (int i = 0; i < massive.length; i++) {
            int ychurdaguSan = 1;
            //учурдагы элементти эсептоо
            for (int j = i + 1; j < massive.length; j++) {
                if (massive[i] == massive[j]) {
                    ychurdaguSan++;
                }
            }
            //Эгер кобойуп жаткан болсо
            if (ychurdaguSan > maxSan) {
                maxSan = ychurdaguSan;
                kopKezdeshkenElement = massive[i];
                kopElementTapkan = true;
            } else if (ychurdaguSan == maxSan) {
                kopElementTapkan = false;
            }
        }
        //Натыйжаны экранга чыгаруу
        if (kopElementTapkan && maxSan > 1) {
            System.out.println("kop kezdeshken element:" + kopKezdeshkenElement + "(кездешуу сан: " + maxSan + ")");
*/



            //Task4
       /* int[] numbers1 = {2, 5, 1, 3, 5};//massive
        for (int i = 0; i < numbers1.length; i++)
            System.out.println(numbers1[i]);
        System.out.println("Ekinchi chon element: " + numbers1[numbers1.length - 2]);

        int[] numbers2 = {2, 5, 1, 3, 5};
        int min = numbers2[0];
        for (int num : numbers2) {
            if (num <= min && min == num) {
                //  min = num;
                System.out.println("En kichine element: " + min);
*/

             /*   int[]numbers1={1,2,3,4,5};
                for(int i= 0; i<numbers1.length;i ++){
                    System.out.println(numbers1[i]);
                    System.out.println("Ekinchi chon elment: "+ numbers1[numbers1.length-2]);
              */
              /*  int[]numbers1={1,2,3,4,5};
                for( int i=0;i<numbers1.length; i++){
                    System.out.println(numbers1[i]);
                    System.out.println();
*/
        }
    }

