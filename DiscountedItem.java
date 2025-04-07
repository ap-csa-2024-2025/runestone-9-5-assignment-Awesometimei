public class DiscountedItem extends Item
{
    private double discountAmount;

    public DiscountedItem(String name, double price, double discountAmount)
    {
        super(name, price);
        this.discountAmount = discountAmount;
    }

    public double getDiscount()
    {
        return discountAmount;
    }

    public void setDiscount(double newDiscountAmount)
    {
        discountAmount = newDiscountAmount;
    }

    public String toString()
    {
        return super.toString() + "(" + super.valueToString(discountAmount) + ")";
    }
}