package test;

public class DiceCal {

    private Dice first;
    private Dice second;

    public static int addDice(Dice first, Dice second) {

        return first.getNumber() + second.getNumber();
    }

    public void getNumber(Dice first, Dice second) {
        this.first = first;
        this.second = second;
    }



    public static String getIndexOf(String str, int index){
        return str.substring(0, index + 1);
    }


    public static boolean odd(Dice dice) {
        if (dice.getNumber() % 2 != 0)
            return true;
        else
            return false;
           // String oddNum="홀수";
           // String evnNum="짝수";
           // return dice.getNumber()%2!= 0;
    }
}
