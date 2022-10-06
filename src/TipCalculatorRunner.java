import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculatorRunner
{
    public static void main(String[]args)
    {
        // Importing
        Scanner question = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //Initializing
        double price = 0;
        double totalB4Tip = 0;
        double totalTip = 0;
        double indCostB4Tip = 0;
        double indTip = 0;
        double totalBillWithTip = 0;
        double totalCostPerPerson = 0;


        //Lore: Introducing the User to the Program
        System.out.println("");
        System.out.println("Welcome to the tip calculator!");
        System.out.println("");
        System.out.print("How many people are in your group? ");
        int partySize = question.nextInt();

        System.out.print("What is the tip percentage? (0 - 100): ");
        int tip = question.nextInt();
        System.out.println("");

        //Core of the Program
        while (price != -1)
        {
            System.out.print("Enter the cost of an item in dollars and cents (Type -1 to End): ");
            price = question.nextDouble();
            totalB4Tip += price;
            System.out.println("");
        }
        totalB4Tip ++;

        System.out.println("--------------------------------------------------------");

        //Formatting My Variables for the Final Product

        totalTip =  ((double) tip) / 100 * totalB4Tip;
        String formattedTotalTip = formatter.format(totalTip);

        indCostB4Tip = totalB4Tip / partySize;
        String formattedIndCostB4Tip = formatter.format(indCostB4Tip);

        indTip = totalTip / partySize;
        String formattedIndTip = formatter.format(indTip);

        totalBillWithTip = totalB4Tip + totalTip;
        String formattedTotalBWT = formatter.format(totalBillWithTip);

        totalCostPerPerson = indCostB4Tip + indTip;
        String formattedTotalCPP = formatter.format(totalCostPerPerson);




        //Final Product
        System.out.println("Total Bill Before Tip: " + totalB4Tip);
        System.out.println("Tip Percentage: " + tip);
        System.out.println("Total Tip: " + formattedTotalTip);
        System.out.println("Total Bill With Tip: " + formattedTotalBWT);
        System.out.println("Per Person Cost Before Tip: " + formattedIndCostB4Tip);
        System.out.println("Tip Per Person: " + formattedIndTip);
        System.out.println("Total Cost Per Person: " + formattedTotalCPP);





        question.close();
    }
}