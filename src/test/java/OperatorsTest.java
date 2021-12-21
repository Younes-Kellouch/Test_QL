import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class OperatorsTest {

    private  Operators operators;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeALL called once before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach is called before each test");
        operators=new Operators();
    }

    @AfterEach
    void tearDown() {
        System.out.println("BeforeEach is called before each test");
        operators=null;
    }

    @Test
    void additionTest() {
        assertEquals(3,operators.addition(1,2));
    }

    @Test
    void multiplicationTest() {
        assertEquals(6,operators.multiplication(2,3));
    }

    @Test()
    void divisionTest() throws Exception {
        assertEquals(2,
                (int)operators.division(4,2));
    }

    @Test()
    void divisionBy0ThrowsExceptionTest(){
        assertThrows(ArithmeticException.class,()->operators.division(1,0));
    }


    @AfterAll

    static  void  afterAll(){
        System.out.println("afterAll called once after all tests");
    }


}