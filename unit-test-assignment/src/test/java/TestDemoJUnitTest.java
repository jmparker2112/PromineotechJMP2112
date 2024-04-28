import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import com.promineotech.TestDemo;

class TestDemoJUnitTest {
	
	

	private TestDemo testDemo;
	
	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}


	
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	 void assertThatTwoPositiveNumbersAreAddedCorrectly() {
		int a = 2;
		int b = 4;
		int expected = 6;
		boolean expectException = false;
		
		if(!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		}	
	
		assertThatThrownBy(() ->
	    testDemo.addPositive(a, b))
	        .isInstanceOf(IllegalArgumentException.class);	
		
	}
	


	static Stream<Arguments> argumentsForAddPositive() {
		// @formatter:off
		return Stream.of(
		arguments(2, 4, 6, false),
		arguments(3, 7, 10, false)
		);
	}
	
	
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(2,4)).isEqualTo(6);
		assertThat(testDemo.addPositive(3,7)).isEqualTo(10);
		
	}
		
	@Test
	void assertThatNumberSquaredIsCorrect() {
		TestDemo mockDemo = spy(testDemo);
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);

	}
	
	
}
