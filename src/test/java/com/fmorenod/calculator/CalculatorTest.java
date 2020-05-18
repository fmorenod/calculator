package com.fmorenod.calculator;

// import org.junit.Test;
// import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// import static org.junit.Assert.*;				
// import org.junit.Test;		


public class CalculatorTest {
private Calculator calculator = new Calculator();
@Test
public void testSum() {
assertEquals(5, calculator.sum(2, 3));
}
}