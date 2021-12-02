import Operations.DoubleOperands;
import org.testng.annotations.Test;
import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;


public class IntegrationTestCases {
    DoubleOperands testTwo = new DoubleOperands();

    @Test
    public void sumAndSub(){
        int temp = -24;
        int x = testTwo.sum(8,4)*testTwo.sub(3,5);
        assertThat(temp).isEqualTo(x);
        System.out.println("val"+x+temp);
        System.out.println( assertWithMessage("Value"+x+temp));
        System.out.println("===============");


    }
}
