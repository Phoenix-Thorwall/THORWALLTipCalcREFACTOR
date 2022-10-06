public class TipCalculator
{
    //Initializing
    int numPeople;
    int tipPercentage;
    double totalBillB4Tip = 0.0;

    //Constructor
    TipCalculator(int numPeople, int tipPercentage)
    {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
    }

    //Methods
    public double getTotalBillB4Tip()
    {
        return totalBillB4Tip;
    }

    public int getTipPercentage()
    {
        return tipPercentage;
    }

    public void addMeal(double cost)
    {
        totalBillB4Tip += cost;
    }



}
