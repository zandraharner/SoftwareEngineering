package parameterizedTest;

import static org.junit.Assert.assertSame;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// This is a JUnit 5 feature
public class test {
	@ParameterizedTest
	@CsvSource({
	    "1, 1, 2",
	    "5, 3, 8",
	    "10, -20, -10"
	})
	public void add(int summand1, int summand2, int expectedSum) {
		Calculator calculator = new Calculator();
	    assertSame(calculator.add(summand1, summand2), expectedSum);
	}
}
