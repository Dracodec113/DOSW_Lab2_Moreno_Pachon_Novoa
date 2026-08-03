public class User{
    
    private int timesShopped;
    private UserType userType;
    private ShoppingCart shopCart;

    public User(int timesShopped){
        this.timesShopped = timesShopped;
        this.UserType = setUserType(timesShopped);
    }

    private void setUserType(int timesShopped){
        if(timesShopped > 3){
            this.userType = UserType.FrequentUser;
        }
        else{
            this.userType = UserType.NewUser;
        }
    }

    public void addToShoppingCart(Item item){
        shopCart.addToShoppingCart(item);
    }
}