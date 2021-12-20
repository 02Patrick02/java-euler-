/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.fibonacci;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


/**
 *
 * @author Elev
 */
public class Main {
    public static void main(String[] args){
        String data = "73167176531330624919225119674426574742355349194934969835"
                + "203127745063262395783180169848018694788518438586156078911294"
                + "949545950173795833195285320880551112540698747158523863050715"
                + "693290963295227443043557668966489504452445231617318564030987"
                + "111217223831136222989342338030813533627661428280644448664523"
                + "874930358907296290491560440772390713810515859307960866701724"
                + "271218839987979087922749219016997208880937766572733300105336"
                + "788122023542180975125454059475224352584907711670556013604839"
                + "586446706324415722155397536978179778461740649551492908625693"
                + "219784686224828397224137565705605749026140797296865241453510"
                + "047482166370484403199890008895243450658541227588666881164271"
                + "714799244429282308634656748139191231628245861786645835912456"
                + "652947654568284891288314260769004224219022671055626321111109"
                + "370544217506941658960408071984038509624554443629812309878799"
                + "272442849091888458015616609791913387549920052406368991256071"
                + "760605886116467109405077541002256983155200055935729725716362"
                + "69561882670428252483600823257530420752963450";
        
        int[] numbers = new int[data.length()];
        for (int i = 0; i < data.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(data.charAt(i)));
        }
        long maxProduct = Long.MIN_VALUE;
        for(int i = 0; i < numbers.length - 12; i++){
            long product = 1;
            for(int j = 0; j < 13; j++){
                product *= numbers[i + j]; 
            }
            if(product > maxProduct){
                maxProduct = product;
            }
        }
        System.out.println(maxProduct);
    }
}
    
       // BigInteger sum = BigInteger.valueOf(0);
         //   File myObj = new File("C:\\Users\\Elev\\Documents\\NetBeansProjects\\Numbers\\Problem13.txt");
        //try{
         //   Scanner scan = new Scanner(myObj);
          //  while(scan.hasNextLine()){
          //      String data = scan.nextLine();
          //      BigInteger number = new BigInteger(data);
          //      sum = sum.add(number);
          //  }
          //  scan.close();
       // } catch(FileNotFoundException e){
         //   System.out.println("An error occurred");
          //  e.printStackTrace();
        //}
       // System.out.println("Answer: " + sum.toString().substring(0, 10));


        ////////////////////////////
        ////////////////////////////
      //  int n1 = 1;
      //  int n2 = 2;
      //  int fib;
      //  int sum = 0;
        
      //  do{
      //      fib = n1 + n2;
      //      n1 = n2;
      //      n2 = fib;
      //      
      //      if(fib % 2 == 0){
      //          sum += fib;
      //      }
      //  }
      //  while(n1 + n2 < 4000000);
      //  System.out.println(sum);
     //////////////////////////
     //////////////////////////
      // int sum = 0;
       
      // for(int n = 0; n < 1000;n++){
        //   if(n % 3 == 0 || n % 5 == 0){
        //       sum += n;
       //    }
       //}
      //  System.out.println(sum);
        
 //   }
//}
