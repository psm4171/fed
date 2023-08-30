package test;

public class Main {

/*
* Main Method
*
* @param args input 인자.
*/

    public static void main(String [] args) {
        int random1 = (int) (Math.random() * 6) + 1;
        int random2 = (int) (Math.random() * 6) + 1;

        Dice first = new Dice(random1);
        Dice second = new Dice(random2);

        System.out.println("주사위의 합 : " + DiceCal.addDice(first, second));

        String str = "abcdefg";

        int val = (int) (Math.random() * str.length());
        System.out.println(DiceCal.getIndexOf(str, val));

        int random4 = (int) (Math.random() * 6) + 1;
        Dice dice = new Dice(random4);

        System.out.println("주사위 눈이 " + random4 + " (이)면 홀수? : " + DiceCal.odd(dice));

        //음수 들어오면 예외 발생
        Library lib = new Library(5);
        
        try {
            new Library(-1);
        } catch (IllegalArgumentException exception){
            //Throwable exception;
             System.out.println(exception.getMessage());
            // System.out.println("Error!");
            // throw new IllegalArgumentException("-1을 올바르지 않습니다. ");
        }

        System.out.println();

      //  lib.add(-1);

        lib.add("해리포터");
        lib.add("샬롯의 거미줄");
        lib.add("어린왕자");
        lib.add("개미");
        lib.del("해리포터");
        lib.find("샬롯의 거미줄");

        lib.findAll();


    }
}
