package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class ExtendableVendingMachine extends Product {
    private int saltySnackCount;
    private int softDrinkCount;
    private int chocolateCount;

    public ExtendableVendingMachine(int saltySnackCount, int softDrinkCount, int chocolateCount) {
        this.saltySnackCount = saltySnackCount;
        this.softDrinkCount = softDrinkCount;
        this.chocolateCount = chocolateCount;

    }

    public void buy(Product product){

        if(product instanceof SaltySnack){
               saltySnackCount --;
        } else
            if (product instanceof SoftDrink){
                  softDrinkCount --;
        } else
            if(product instanceof Chocolate){
                 chocolateCount --;
        }
    }
    public int getStockCount(Product product) {
        if (product instanceof SaltySnack) {
            return saltySnackCount;
        } else if (product instanceof SoftDrink) {
            return softDrinkCount;
        } else if (product instanceof Chocolate) {
            return chocolateCount;
        }
        return 0;
    }

    public String getStockCount(){
        return "Salty Snack: " + saltySnackCount + ", Soft Drink: " + softDrinkCount + ", Chocolate: " + chocolateCount;
    }

    public void addProduct(Product product){
        if(product instanceof SaltySnack){
            this.saltySnackCount ++;
        }else
            if(product instanceof SoftDrink){
                this.softDrinkCount ++;
            }else if ((product instanceof Chocolate)) {
                this.chocolateCount ++;
            }

    }
}
