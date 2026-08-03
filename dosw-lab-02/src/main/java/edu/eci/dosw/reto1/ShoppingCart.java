public class ShoppingCart{
    public float discountAmount;
    public List<Item> items;

    public ShoppingCart(float discountAmount, List<Item> items){
        this.discountAmout = discountAmount;
        this.items = items;
    }

    public priceCalculation(){
        long priceNoDiscount = items.stream()
                                .sum()
    }

    public void addToShoppingCart(Item item){
        items.put(item);
    }
}