// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        zd1();
        zd2();
        zd3();
        zd4();
        zd5();
        zd6();
        zd7();
        zd8();


    }
    public static void zd1() {
        int vklad = 15000;
        int bank = 0;
        int check = 0;
        while (bank <= 2459000){
            bank = bank+vklad;
            check = check+1;
            System.out.println("Месяц "+check+", сумма накоплений равна "+bank+" рублей");

        }
    }
    public static void zd2(){
        System.out.println();
        int j = 0;
        while (j < 10){
            j = j+1;
            System.out.print(j+" ");
        }
        System.out.println();
        for(int i = 10;i >0;i = i -1){
            System.out.print(i+" " );
        }
    }
    public static void zd3() {
        System.out.println();
        System.out.println();
        int population = 12000000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * dif / 1000;
            System.out.println("Год "+i+", численность населения составляет "+population);
        }


    }
    public static void zd4(){
        System.out.println();
        int summa = 12000000;
        int bank = 0;
        int money = 15000;
        int percent = (15000/100)* 7;
        int check = 0;
        while (bank<summa){
            bank= bank+money+percent;
            check++;
            System.out.println("Месяц "+check+" сумма накоплений равна "+bank+" рублей");

        }
    }
    public static void zd5(){
        System.out.println();
        int summa = 12000000;
        int bank = 0;
        int money = 15000;
        int percent = (15000/100)* 7;
        int check = 0;
        while (bank<summa){
            bank= bank+money+percent;
            check++;
            if (check %6 == 0) {
                System.out.println("Месяц " + check + " сумма накоплений равна " + bank + " рублей");
            }
        }
    }
    public static void zd6() {
        System.out.println();
        int vklad = 15000;
        int bank = 0;
        int percent = (15000/100)* 7;
        for(int i = 1;i <=9;i = i+1 ){
            for (int j = 1;j <=12;j++){
                bank = bank+vklad+percent;

                if (j ==6 ){
                    System.out.println("Месяц "+i*j+" сумма равна "+bank+" рублей");
                }
                if (i == 9 && j == 12){
                    System.out.println();
                    System.out.println("Всего "+i*j+" месяцев и накопления составили "+bank+" рублей");
                }
            }

        }
    }
    public static void zd7(){
        System.out.println();

        int checkFriday = 4;
        while (checkFriday<=31){
            if ( checkFriday<31){
                System.out.println("Сегодня пятница, "+checkFriday+"-е число. Необходимо подготовить отчет");
                checkFriday = checkFriday+7;
            }

            ;
        }
    }
    public static void zd8(){
        System.out.println();
        int yearCometa = 0;
        while (yearCometa<2123){
            if (yearCometa >= 2023-200 && yearCometa<=2023+100){
                System.out.println(yearCometa);
            }
            yearCometa= yearCometa+79;
        }
    }

}