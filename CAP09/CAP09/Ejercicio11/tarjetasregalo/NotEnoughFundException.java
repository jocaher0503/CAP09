package Ejercicio11.tarjetasregalo;

public class NotEnoughFundException extends Exception{
    public double amount;
    
    public NotEnoughFundException(double amount){
        this.amount = amount;
    }

    
}