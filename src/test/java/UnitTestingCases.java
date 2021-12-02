import Operations.DoubleOperands;
import org.testng.annotations.Test;
import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import org.testng.Assert;

public class UnitTestingCases {
   // int result  = 6;
    DoubleOperands testOne = new DoubleOperands();



    @Test (groups = { "UnitTest" })
    public void testSum(){
        int temp = 2+4;
        assertThat(temp).isEqualTo( testOne.sum(2,4));
        assertWithMessage("return type is no veiled ");

       // assertThat(sum(64,4));
    }
    @Test
    public void testbfobj(){
        int z = 9+0;
        assertThat(z).isEqualTo(testOne.bfobj.apply(9,1));
    }
}
