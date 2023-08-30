/*
package test;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하세요 : ");
        int year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("입력한 년도는 윤년입니다. ");
        } else {
            System.out.println("입력한 년도는 윤년이 아닙니다. ");
        }

        sc.close();
    }
}*/

/*
package test;

import java.util.Scanner;

public class Year {
    */
/*
     *
     * main 입니다.
     * *//*

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하세요 : ");
        int year = sc.nextInt();
        int day = 0;


        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("입력한 년도는 윤년입니다. ");
            day = sc.nextInt();

            if (day % 31 == 0) {
                month += 1;
                month += 2;

                day = month = 0 % day;
            }
            System.out.print(month +"월");
            //  System.out.println("입력한 수를 날짜로 변경하면 " + month + "월 " + day + "일 입니다.");

        }
        else {
            System.out.println("입력한 년도는 윤년이 아닙니다. ");
            day = sc.nextInt();

            if (day % 30 == 0) {
                month = 2;
                month += 2;
                day = month % day;

            }
            //   System.out.println("입력한 수를 날짜로 변경하면 " + month + "월" + day + "일 입니다.");
        }

        sc.close();
    }
}*/
