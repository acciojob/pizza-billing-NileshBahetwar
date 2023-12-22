package com.driver;

public class Pizza {

    private int billPrice;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;
    private int paperBagPrice;

    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;



    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice=80;
        this.paperBagPrice=20;
        if(this.isVeg){
            this.billPrice=300;
            this.toppingsPrice=70;
        }
        else{
            this.billPrice=400;
            this.toppingsPrice=120;
        }
        this.bill="Base Price Of The Pizza: "+this.billPrice+"\n";
    }

    public int getPrice(){
        return this.billPrice;
    }

    public void addExtraCheese(){  //  it can take any no of time but only once has to pay
        // your code goes here
        if(isCheeseAdded==false){
            this.billPrice+=cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.billPrice+=toppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded==false){
            this.billPrice+=paperBagPrice;
            isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
   // comment this line jujnjnk
        //
        if(isBillGenerated==false){
            if(isCheeseAdded){
                this.bill="Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingsAdded){
                this.bill="Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isPaperBagAdded){
                this.bill="Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill="Total Price: "+this.billPrice+"\n";
            isBillGenerated=true;
        }
        return this.bill; ////
        ///
    }
}
