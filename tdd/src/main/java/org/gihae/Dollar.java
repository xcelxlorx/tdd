package org.gihae;

public class Dollar extends Money{

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public String currency(){
        return currency;
    }

    public Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }
}
