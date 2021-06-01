package com.company;

public class Main {

    public static void main(String[] args) {

        int x = 1; //столбец.
        while (x<=10){


            int y = 1; //строка
            while (y <=20){
                if (x==1 || x==10) {
                    System.out.print("Б");
                }
                    else if (y==1 || y==20){
                        System.out.print("Б ");
                    }
                    else {
                    System.out.print(" ");
                }


                y++;
            }
            System.out.println(" ");
            x++;
        }


    }





}
