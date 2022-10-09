public class TipCalculator
{
    //Initializing
    int numPeople;
    int tipPercentage;
    double totalBillB4Tip = 0.0;
    double tip;
    double billFinal;
    double perPersonB4Tip;
    double perPersonTip;
    double perPersonFinal;

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

    public int getTipPercentage(int userInputTip)
    {
        tipPercentage = userInputTip;
        return tipPercentage;
    }

    public void addMeal(double cost)
    {
        totalBillB4Tip += cost;
    }

    public double tipAmount()
    {
        tip = totalBillB4Tip * ((double)tipPercentage / 100);
        return tip;
    }

    public double totalBill()
    {
        billFinal = tip + totalBillB4Tip;
        return billFinal;
    }

    public double perPersonCostB4Tip()
    {
        perPersonB4Tip = totalBillB4Tip / numPeople;
        return perPersonB4Tip;
    }

    public double perPersonTipAmount()
    {
        perPersonTip = tip / numPeople;
        return perPersonTip;
    }

    public double perPersonTotal()
    {
        perPersonFinal = perPersonB4Tip + perPersonTip;
        return perPersonFinal;
    }

    public double setBillTotal(double total)
    {
        billFinal = total;
        return billFinal;
    }

}
