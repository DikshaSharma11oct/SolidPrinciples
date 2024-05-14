package com.example.Di;

public class ShoppingMall {

    // // it is also example of composition ->tightly Coupled
    // private CreditCard creditcard;

    // // Constructor
    // public ShoppingMall(CreditCard creditcard){
    //     this.creditcard=creditcard;
    // }

    // public void doPurchase(long amt){
    //     creditcard.doTransection(amt);
      
    // }

    // public static void main(String[] args){
    //     // if any issue occur with credit card we can use debit card but need to do lots of implemetation so not a good approach

    //     CreditCard creditCard =new CreditCard();
    //     ShoppingMall shpMall= new ShoppingMall(creditCard);
   
    //     shpMall.doPurchase(123);
    // }

    // 
    private BankCard bankCard;

    // Constructor
    public ShoppingMall(BankCard bankCard){
        this.bankCard=bankCard;
    }
 
    public void doPurchase(long amt){
        bankCard.doTransection(amt);
       
    }
 
    public static void main(String[] args){

        BankCard bankCard =new DebitCard();//runtimepolymorphism 
        ShoppingMall shpMall= new ShoppingMall(bankCard);
    
        shpMall.doPurchase(123);
    }

    
}
