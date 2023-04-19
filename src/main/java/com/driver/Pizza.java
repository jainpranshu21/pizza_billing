package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int cheesePrice;
    private int toppingPrice;
    private int paperBagPrice;


    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            basePrice=300;
            toppingPrice=70;
        }
        else{
            basePrice=400;
            toppingPrice=120;
        }
        cheesePrice=80;
        paperBagPrice=20;
        bill="Base Price Of The Pizza: " +basePrice+ "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price+=cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
      if(isToppingAdded==false){
          this.price+=toppingPrice;
          isToppingAdded=true;
      }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded==false){
            this.price+=paperBagPrice;
            isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
           if(isCheeseAdded==true){
               bill+="Extra Cheese Added: "+cheesePrice+"\n";
           }
           if(isToppingAdded==true){
               bill+="Extra Toppings Added: "+toppingPrice+"\n";
           }
           if(isPaperBagAdded==true)
               bill+="Paperbag Added: "+paperBagPrice+"\n";

           bill+="Total Price: "+this.price+"\n";
           isBillGenerated=true;
        }
        return this.bill;
    }
}
