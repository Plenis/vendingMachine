//package vending;
//
//import org.junit.jupiter.api.Test;
//import vending.product.Chocolate;
//import vending.product.Product;
//import vending.product.SaltySnack;
//import vending.product.SoftDrink;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class OverloadedVendingMachineTest {
//
//    @Test
//    public void shouldBuyAProduct(){
//     OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 10, 10);
//     Product product = new Product();
//
//     vendingMachine.buy(product);
//
//     assertEquals(product.description(), "You have purchased all three products");
//     assertEquals(vendingMachine.getStockCount(), "Salty Snack: 9, Soft Drink: 9, Chocolate: 9");
//    }
//
//    @Test
//    public void shouldBuyASaltyDrink(){
//        OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 10, 10);
//        SaltySnack saltySnack = new SaltySnack();
//
//        vendingMachine.buy(saltySnack);
//        vendingMachine.buy(saltySnack);
//        vendingMachine.buy(saltySnack);
//
//        assertEquals(saltySnack.description(), "Salty snack purchased!");
//        assertEquals(vendingMachine.getStockCount(saltySnack), 7);
//    }
//
//    @Test
//    public void shouldBuyASoftDrink(){
//        OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 10, 10);
//        SoftDrink softDrink = new SoftDrink();
//
//        vendingMachine.buy(softDrink);
//        vendingMachine.buy(softDrink);
//        vendingMachine.buy(softDrink);
//        vendingMachine.buy(softDrink);
//        vendingMachine.buy(softDrink);
//
//        assertEquals(softDrink.description(), "Soft drink purchased!");
//        assertEquals(vendingMachine.getStockCount(softDrink), 5);
//    }
//
//    @Test
//    public void shouldBuyAChocolate(){
//        OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10,10,10);
//        Chocolate chocolate = new Chocolate();
//
//        vendingMachine.buy(chocolate);
//        vendingMachine.buy(chocolate);
//        vendingMachine.buy(chocolate);
//        vendingMachine.buy(chocolate);
//        vendingMachine.buy(chocolate);
//        vendingMachine.buy(chocolate);
//        vendingMachine.buy(chocolate);
//
//        assertEquals(chocolate.description(), "Chocolate purchased!");
//        assertEquals(vendingMachine.getStockCount(chocolate), 3);
//    }
//
//    @Test
//    public void shouldBeAbleToAddSaltySnack(){
//        OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 10, 10);
//        SaltySnack saltySnack = new SaltySnack();
//
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(saltySnack);
//
//        assertEquals(vendingMachine.getStockCount(saltySnack), 15);
//    }
//
//    @Test
//    public void shouldBeAbleToAddSoftDrink(){
//        OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10,10,10);
//        SoftDrink softDrink = new SoftDrink();
//
//        vendingMachine.addProduct(softDrink);
//        vendingMachine.addProduct(softDrink);
//        vendingMachine.addProduct(softDrink);
//        vendingMachine.addProduct(softDrink);
//
//        assertEquals(vendingMachine.getStockCount(softDrink), 14);
//    }
//
//    @Test
//    public void shouldBeAbleToAddChocolate(){
//        OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 10, 10);
//        Chocolate chocolate = new Chocolate();
//
//        vendingMachine.addProduct(chocolate);
//        vendingMachine.addProduct(chocolate);
//        vendingMachine.addProduct(chocolate);
//
//        assertEquals(vendingMachine.getStockCount(chocolate), 13);
//    }
//
//    @Test
//    public void shouldBeAbleToAddProducts(){
//        OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 10, 10);
//        SaltySnack saltySnack = new SaltySnack();
//        SoftDrink softDrink = new SoftDrink();
//        Chocolate chocolate = new Chocolate();
//
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(softDrink);
//        vendingMachine.addProduct(softDrink);
//        vendingMachine.addProduct(chocolate);
//
//        assertEquals(vendingMachine.getStockCount(saltySnack), 13);
//        assertEquals(vendingMachine.getStockCount(softDrink), 12);
//        assertEquals(vendingMachine.getStockCount(chocolate), 11);
//    }
//
//    @Test
//    public void shouldBeAbleToGetStockCount(){
//        OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 10, 10);
//        SaltySnack saltySnack = new SaltySnack();
//        SoftDrink softDrink = new SoftDrink();
//        Chocolate chocolate = new Chocolate();
//
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(saltySnack);
//        vendingMachine.addProduct(softDrink);
//        vendingMachine.buy(softDrink);
//        vendingMachine.buy(chocolate);
//        vendingMachine.buy(chocolate);
//
//        assertEquals(vendingMachine.getStockCount(), "Salty Snack: 14, Soft Drink: 10, Chocolate: 8");
//    }
//}