import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMMachineproblemTest {

    public static ATM_Machine_problem atmMachineproblem;
    public static ATMorder atr;

    // Make sure class ATM_Machine_problem extends ATMResStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            atmMachineproblem = new ATM_Machine_problem();
            atr = new ATMorder();
        }

        @Test
        public void testatm1(){
            assertTrue(atmMachineproblem.input('l'));
        }

        @Test
        public void testatm2(){
            assertFalse(atmMachineproblem.input('w'));
        }

        @Test
        public void testatm3(){
            assertTrue(atmMachineproblem.input('d'));
        }

        @Test
        public void testatm4(){
            assertTrue(atmMachineproblem.input('o'));
        }

        @Test
        public void testatm5(){
            assertTrue(atmMachineproblem.input('u'));
        }

        @Test
        public void testatm6(){
            assertTrue(atmMachineproblem.input('f'));
        }

        @Test
        public void testatm7(){
            assertTrue(atmMachineproblem.input('l'));
        }

        @Test
        public void testatr(){
            assertFalse(atr.withdraw());
            atr.fill(1);
            assertTrue(atr.withdraw());
            assertFalse(atr.withdraw());
            atr.fill(3);
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
        }

    }


    // Make sure class ATM_Machine_problem extends ATMorder
    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            atmMachineproblem = new ATM_Machine_problem();
            atr = new ATMorder();
        }

        @Test
        public void testatr(){
            assertFalse(atr.withdraw());
            atr.fill(1);
            assertTrue(atr.withdraw());
            assertFalse(atr.withdraw());
            atr.fill(3);
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
        }


        @Test
        public void testatm1(){
            assertTrue(atmMachineproblem.input('l'));
        }

        @Test
        public void testatm2(){
            assertFalse(atmMachineproblem.input('w'));
        }

        @Test
        public void testatm3(){
            assertTrue(atmMachineproblem.input('d'));
        }

        @Test
        public void testatm4(){
            assertTrue(atmMachineproblem.input('w'));
        }

        @Test
        public void testatm5(){
            assertTrue(atmMachineproblem.input('o'));
        }

        @Test
        public void testatm6(){
            assertTrue(atmMachineproblem.input('u'));
        }

        @Test
        public void testatm7(){
            assertTrue(atmMachineproblem.input('f'));
        }

        @Test
        public void testatm8(){
            assertTrue(atmMachineproblem.input('l'));
        }

        @Test
        public void testatm9(){
            assertTrue(atmMachineproblem.input('l'));
        }

    }

}