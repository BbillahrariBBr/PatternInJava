package com.company;

// TODO: 8/3/2017 Baki Billah
class Pattern23 {

    public static void main(String [] args){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print((char)(j+64)+ " ");

            }

            System.out.println();
        }
    }//end of main
}// end of class
