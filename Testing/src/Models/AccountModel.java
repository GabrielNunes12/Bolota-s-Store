package Models;

public class AccountModel {
    public static double DEPOSIT_FEE_PERCENTAGE = 0.02;

    private Long id;
    private Double balance;

    public AccountModel() {
    }

    public AccountModel(Long id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        String messageAmount = "Can not add a negative amount";
        if(amount > 0){
            amount -= amount * DEPOSIT_FEE_PERCENTAGE;
            balance += amount;
        } else {
            isAmountBelowThenBalance(messageAmount);
        }
    }

    public String isAmountBelowThenBalance(String message) {
        return message;
    }

    public void withdraw (double amount) {
        if(balance < amount) return;
        balance -= amount;
    }

    public double fullWithdraw() {
        double aux = balance;
        balance = 0.00;
        return aux;
    }

}
