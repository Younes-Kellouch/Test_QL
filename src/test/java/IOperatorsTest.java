import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class IOperatorsTest {
    IOperators iOperators;


    @BeforeEach
    void setUp() {
        iOperators= Mockito.mock(IOperators.class);
    }

    @Test
    void additionTest() {
        when(iOperators.addition(1,2)).thenReturn(3);
        assertEquals(3,iOperators.addition(1,2));
    }
}