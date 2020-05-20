package vending;

import vending.product.*;


public class ExtendableVendingMachine extends Product {
    private int saltySnackCount;
    private int softDrinkCount;
    private int chocolateCount;
    private int jellyBeanCount;

    public static void main(String[]args){

    }
    public ExtendableVendingMachine(int saltySnackCount, int softDrinkCount, int chocolateCount, int jellyBeanCount) {
        this.saltySnackCount = saltySnackCount;
        this.softDrinkCount = softDrinkCount;
        this.chocolateCount = chocolateCount;
        this.jellyBeanCount = jellyBeanCount;

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
        } else
            if(product instanceof JellyBean){
                jellyBeanCount --;
            }
    }
    public int getStockCount(Product product) {
        if (product instanceof SaltySnack) {
            return saltySnackCount;
        } else if (product instanceof SoftDrink) {
            return softDrinkCount;
        } else if (product instanceof Chocolate) {
            return chocolateCount;
        } else if (product instanceof JellyBean){
            return jellyBeanCount;
        }
        return 0;
    }

    public String getStockCount(){
        return "Salty Snack: " + saltySnackCount + ", Soft Drink: " + softDrinkCount + ", Chocolate: " + chocolateCount + ", Jelly Beans: " + jellyBeanCount;
    }

    public void addProduct(Product product){
        if(product instanceof SaltySnack){
            this.saltySnackCount ++;
        }else
            if(product instanceof SoftDrink){
                this.softDrinkCount ++;
            }else if ((product instanceof Chocolate)) {
                this.chocolateCount ++;
            }else if (product instanceof JellyBean){
                this.jellyBeanCount ++;
            }

    }
}
