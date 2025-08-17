/*Mini project in JAVA*/
/*In this the computer will generate a number and then the user has to guess it. To terminate this game, user has to enter -1. */

import java.util.Scanner;
class Demo{
   public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int myNumber = (int)(Math.random() * 100);
  int userNumber;
  do{
    System.out.println("Guess the Number");
    userNumber = sc.nextInt();
    if( userNumber == myNumber){
      System.out.println("Wohooo...!! You predicted the number");
    }
    else if(userNumber > myNumber){
      System.out.println("Sorry!! your number is too big");
    }
    else{
      System.out.println("Your number is too small");
    }
  }while(userNumber > 0);
  System.out.println("My number was:");
  System.out.println(myNumber);
  }
}