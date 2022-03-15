package Tests.factory;

import Models.AccountModel;

public class AccountFactory {
    public static AccountModel createEmptyAccount() {
        return new AccountModel(1L, 0.00);
    }
    public static AccountModel createAccountWithValues(double amount) {
        return new AccountModel(1L, amount);
    }

}
