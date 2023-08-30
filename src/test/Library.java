package test;

import java.util.Objects;
import java.util.Scanner;

public class Library {

    private String[] list;
    private int count;
    private int size;


    public Library(int size){
        if(size < 1 ){
            throw new IllegalArgumentException("도서관 크기는 1보다 작은 값을 넣을 수 없습니다.");
        }

        list = new String[size];
        count=0;

        for(int i=0; i<size; i++){
            list[i] = "";
        }
    }

    public void add(String title) {
   if(count == list.length){
       // 꽉 참 threw new
       throw new IllegalArgumentException("already ");
   }
    
        for (int i = 0; i < size; i++){
            if (list[i].equals(title)){
                throw new IllegalArgumentException();
            }
        }

        list[count] = title;
        count++;
        System.out.println("[" + title + "]" + "책을 추가했습니다.");
    }



    public void del(String title) {

        if (count == 0)
            throw new IllegalArgumentException(title + "No delete!");

        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(title)) {
                for (int j = i; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[list.length - 1] = "";
                count -= 1;
            }
            // return;
        }
        //throw new IllegalArgumentException(title + "을 제거 했습니다.");
        System.out.println("[" + title + "]책을 제거했습니다.");
    }


    public void find(String title){
        for (int i = 0; i < size; i++){
            if (list[i].equals(title)){
               System.out.println("책 찾은 결과 : " +  title);
                return;
            }
            else
                System.out.println(title + " 책을 찾을 수 없습니다.");
        }
    }

    public void findAll() {
        for (int i = 0; i < list.length; i++) {
        if (list[i].equals("")){
            continue;
        }
            System.out.println((i + 1) + " : " + list[i]);
        }
}



}
