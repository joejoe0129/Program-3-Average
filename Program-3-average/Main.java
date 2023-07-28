// Jordan Joseph
// 1/13/23
// The program reads an unspecified number of integers, and determines how many positive and negative values have been read, and computes the total and average of the input values (not counting zeros). The program ends with the input 0
import java.util.Scanner;
class Main {
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
    
    double numerat = 0;
    double denomin = 0;
    double adder = 1;   //the numbers
    int negnum = 0;
    int posnum = 0;
    
      while((denomin != 10) && (adder != 0)){ //the rules
        System.out.print("Please enter a number:");
        adder = scan.nextDouble();
        numerat = numerat + adder;
        denomin++;

        if(adder > 0){ // postive numbers
          posnum++;
        }
        else if(adder < 0){ // negative numbers
          negnum++;
        }
        else{ // zero
          denomin--;
        }  
       
      }

    Double ave = (numerat)/(denomin);
    System.out.println("You entered "+ posnum +" positive numbers");
    System.out.println("You entered "+ negnum +" negative numbers");
    System.out.println("The average of your numbers is " + ave);
        
  }
}  