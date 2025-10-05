//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

// import scanner class
public class ShipCostCalculator {
    public static void main(String[] args) {
        // new scanner designated as in
        Scanner in =  new Scanner(System.in);
        double itemCost = 0.0;
        double shipCost = 0.0;


        System.out.print("Enter the item cost: ");
        itemCost = in.nextDouble();

        // reads user input

        if(itemCost >= 100){
            System.out.println("Your shipping fee is: " + shipCost);
            System.out.print("Your total is: " + itemCost);
        }
        else {
            shipCost = itemCost * 0.02;
            itemCost = itemCost + shipCost;
            System.out.println("Your shipping fee is: " + shipCost);
            System.out.println("Your total is: " + itemCost);

        }




    }
}