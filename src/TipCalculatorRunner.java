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

        //Lore: Introducing the User to the Program
        System.out.println("");
        System.out.println("Welcome to the tip calculator!");
        System.out.println("");
        System.out.print("How many people are in your group? ");
        int partySize = question.nextInt();

        System.out.print("What is the tip percentage? (0 - 100): ");
        int tip = question.nextInt();
        System.out.println("");

        //Creating a new TipCalculator Object Based on the User's Input
        TipCalculator party = new TipCalculator(partySize, tip);
        party.getTipPercentage(tip);

        //Core of the Program
        while (price != -1)
        {
            System.out.print("Enter the cost of an item in dollars and cents (Type -1 to End): ");
            price = question.nextDouble();
            party.addMeal(price);
            System.out.println("");
        }
        party.addMeal(1);
        party.setBillTotal(party.getTotalBillB4Tip());

        System.out.println("--------------------------------------------------------");

        //Putting the Decimal Formatter to Use!
        String formattedTotalTip = formatter.format(party.tipAmount());
        String formattedTotalBillWithTip = formatter.format(party.totalBill());
        String formattedPerPersonCostB4Tip = formatter.format(party.perPersonCostB4Tip());
        String formattedTipPerPerson = formatter.format(party.perPersonTipAmount());
        String formattedTotalCostPerPerson = formatter.format(party.perPersonTotal());

        //Final Product
        System.out.println("Total Bill Before Tip: " + party.getTotalBillB4Tip());
        System.out.println("Tip Percentage: " + party.getTipPercentage(tip));
        System.out.println("Total Tip: " + formattedTotalTip);
        System.out.println("Total Bill With Tip: " + formattedTotalBillWithTip);
        System.out.println("Per Person Cost Before Tip: " + formattedPerPersonCostB4Tip);
        System.out.println("Tip Per Person: " + formattedTipPerPerson);
        System.out.println("Total Cost Per Person: " + formattedTotalCostPerPerson);

        question.close();
    }
}