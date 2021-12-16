import Operations.DoubleOperands;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class UnitTestingCases {
    // int result  = 6;
    DoubleOperands testOne = new DoubleOperands();


    @Test(groups = {"UnitTest"})
    public void reTestSum() {
        int temp = 2 + 4;
        assertThat(temp).isEqualTo(testOne.sum(2,3));
        assertWithMessage("return type is no veiled ");
        assertThat(testOne.sum(2,3));
    }

    @Test
    public void testbfobj() {
        int z = 9;
        assertThat(z).isEqualTo(testOne.bfobj.apply(9, 1));
    }

}
