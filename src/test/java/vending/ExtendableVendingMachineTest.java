package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.JellyBean;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.*;

class ExtendableVendingMachineTest {

    @Test
    void shouldBeAbleToBuySaltySnack() {
        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(5,5,5, 5);
        SaltySnack saltySnack = new SaltySnack();

        vendingMachine.buy(saltySnack, 2);

        assertEquals(saltySnack.description(), "Salty snack purchased!");
        assertEquals(vendingMachine.getStockCount(saltySnack), 3);
    }

    @Test
    void shouldBeAbleToBuySoftDrink() {
        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(5,5,5, 5);
        SoftDrink softDrink = new SoftDrink();

        vendingMachine.buy(softDrink, 3);

        assertEquals(softDrink.description(), "Soft drink purchased!");
        assertEquals(vendingMachine.getStockCount(softDrink), 2);
    }

    @Test
    void shouldBeAbleToBuyChocolate() {
        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(5,5,5, 5);
        Chocolate chocolate = new Chocolate();

        vendingMachine.buy(chocolate, 2);

        assertEquals(chocolate.description(), "Chocolate purchased!");
        assertEquals(vendingMachine.getStockCount(chocolate), 3);
    }

    @Test
    void shouldBeAbleToBuyJellyBean() {
        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(5,5,5, 5);
        JellyBean jellyBean = new JellyBean();

        vendingMachine.buy(jellyBean, 2);

        assertEquals(jellyBean.description(), "Jelly beans purchased!");
        assertEquals(vendingMachine.getStockCount(jellyBean), 3);
    }

    @Test
    void shouldBeAbleToGetProductStockCount(){
        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(5,5, 5, 5);
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        Chocolate chocolate = new Chocolate();
        JellyBean jellyBean = new JellyBean();

        vendingMachine.buy(saltySnack, 2);
        vendingMachine.buy(softDrink, 1);
        vendingMachine.buy(chocolate, 3);
        vendingMachine.buy(jellyBean, 4);

        assertEquals(vendingMachine.getStockCount(), "Salty Snack: 3, Soft Drink: 4, Chocolate: 2, Jelly Beans: 1");
    }

    @Test
    void shouldBeAbleToAddStock(){
        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(5,5, 5, 5);
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        Chocolate chocolate = new Chocolate();
        JellyBean jellyBean = new JellyBean();

        vendingMachine.addProduct(saltySnack, 3);
        vendingMachine.addProduct(softDrink, 4);
        vendingMachine.addProduct(chocolate, 3);
        vendingMachine.addProduct(jellyBean, 2);

        assertEquals(vendingMachine.getStockCount(),"Salty Snack: 8, Soft Drink: 9, Chocolate: 8, Jelly Beans: 7");
    }

}