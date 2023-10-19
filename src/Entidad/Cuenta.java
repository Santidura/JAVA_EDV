package Entidad;

public class Cuenta {

    private int accountNumber;
    private long clientDni;
    private double currentBalance;

    public Cuenta(int accountNumber, long clientDni, double currentBalance){
        this.accountNumber = accountNumber;
        this.clientDni = clientDni;
        this.currentBalance = currentBalance;
    }

    public Cuenta(){}

    // Setters

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setClientDni(long clientDni){
        this.clientDni = clientDni;
    }

    public void setCurrentBalance(double currentBalance){
        this.currentBalance = currentBalance;
    }

    // Getters

    public int getAccountNumber(){
        return accountNumber;
    }

    public long getClientDni(){
        return clientDni;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }
}
