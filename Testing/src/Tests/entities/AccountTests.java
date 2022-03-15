package Tests.entities;
import Models.AccountModel;
import Tests.factory.AccountFactory;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        //Arrange
        double amountValue = 200.0;
        double expectedValue = 196.0;
        AccountModel accountModel = AccountFactory.createEmptyAccount();

        //Act
        accountModel.deposit(amountValue);

        //Assert
        Assertions.assertEquals(expectedValue, accountModel.getBalance());
    }

    @Test
    public void depositShouldReturnNullValueWhenNegativeAmount() {
        //Arrange
        AccountModel accountModel = AccountFactory.createEmptyAccount();

        //Act
        accountModel.deposit(-10.00);

        //Assert
        Assertions.assertEquals(0.00, (Object) accountModel.getBalance());
    }

    @Test
    public void withdrawShouldBeBelowBalanceValueWhenPassANegativeNumber(){
        //Arrange
        AccountModel accountModel = AccountFactory.createAccountWithValues(20.00);

        //Act
        accountModel.withdraw(10.00);

        //Assertion
        Assertions.assertEquals(10, accountModel.getBalance());
    }

    @Test
    public void withdrawShouldReturnBalanceValueWhenAmountSurpassTheBalanceValue() {
        //Arrange
        AccountModel accountModel = AccountFactory.createAccountWithValues(200.00);

        //ACT
        accountModel.withdraw(300.00);

        //Assertion
        Assertions.assertEquals(200, accountModel.getBalance());
    }

    @Test
    public void withdrawShouldReturnZeroOnBalance() {
        //Arrange
        AccountModel accountModel = AccountFactory.createAccountWithValues(200.00);

        //ACT
        accountModel.fullWithdraw();

        //Assertion
        Assertions.assertEquals(0, accountModel.getBalance());
    }
}
