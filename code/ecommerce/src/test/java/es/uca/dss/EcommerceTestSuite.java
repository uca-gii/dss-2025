package es.uca.dss;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ShoppingCartTest.class, ProductTest.class /*, CreditCardTest.class */ })
public class EcommerceTestSuite {
    //...
}
