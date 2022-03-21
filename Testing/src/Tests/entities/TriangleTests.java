package Tests.entities;

import Models.Triangle;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
public class TriangleTests {

    @Test
    public void triangleShouldDisplay6FloatValue() {
        //Arrange
        double a = 5.00;
        double b = 4.00;
        double c = 3.00;
        double expectedValue = 6.0000;
        Triangle triangleModel = new Triangle();

        //Act
        triangleModel.getResultArea(a, b , c);

        //Assert
        Assertions.assertEquals(expectedValue, triangleModel.getResult());
    }

}
