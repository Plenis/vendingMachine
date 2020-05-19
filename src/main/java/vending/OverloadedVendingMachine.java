package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {

    private int saltySnackCount;
    private int softDrinkCount;
    private int chocolateCount;

    public OverloadedVendingMachine(int saltySnackCount, int softDrinkCount, int chocolateCount) {
        this.saltySnackCount = saltySnackCount;
        this.softDrinkCount = softDrinkCount;
        this.chocolateCount = chocolateCount;

    }

    public void buy(SaltySnack saltySnack){
        this.saltySnackCount --;
    }

    public void buy(SoftDrink softDrink){
        this.softDrinkCount --;
    }

    public void buy(Chocolate chocolate){
        this.chocolateCount --;
    }

    public void buy(Product product){
        this.saltySnackCount --;
        this.softDrinkCount --;
        this.chocolateCount --;
    }

    public int getSaltySnackCount(){
        return saltySnackCount;
    }

    public int getSoftDrinkCount(){
        return softDrinkCount;
    }

    public int getChocolateCount(){
        return chocolateCount;
    }

    public void addProduct(SaltySnack saltySnack){
        this.saltySnackCount ++;
    }

    public void addProduct(SoftDrink softDrink){
        this.softDrinkCount ++;
    }

    public void addProduct(Chocolate chocolate){
        this.chocolateCount ++;
    }
}
