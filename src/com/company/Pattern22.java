package com.company;

// TODO: 8/3/2017 BakiBillah
 class Pattern22 {

     public static void main(String [] args){

         for (int i = 5; i >=1 ; i--) {

             for (int j = i; j >=1 ; j--) {
                 System.out.print((char)(i+64) + " ");


             }

             System.out.println();

         }
     }//end of main
}//end of class
