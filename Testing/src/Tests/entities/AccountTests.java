package Tests.entities;
import Models.AccountModel;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        //Arrange
        double amountValue = 200.0;
        double expectedValue = 196.0;
        AccountModel accountModel = new AccountModel(1L, 0.00);

        //Act
        accountModel.deposit(amountValue);

        //Assert
        Assertions.assertEquals(expectedValue, accountModel.getBalance());
    }
}
