package unit;

import com.gmail.solovyov.daniil.SuperSimpleCalculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class SuperSimpleCalculatorTest {

	@Test
	public void shouldAdd() {
		SuperSimpleCalculator ssc = new SuperSimpleCalculator(1, 2, "+");

		Integer result = ssc.calculate();

		assertThat(result).isEqualTo(3);
	}

	@Test
	public void shouldSubtract() {
		SuperSimpleCalculator ssc = new SuperSimpleCalculator(8, 2, "-");

		Integer result = ssc.calculate();

		assertThat(result).isEqualTo(6);
	}

	@Test
	public void shouldMultiply() {
		SuperSimpleCalculator ssc = new SuperSimpleCalculator(3, 4, "*");

		Integer result = ssc.calculate();

		assertThat(result).isEqualTo(12);
	}

	@Test
	public void shouldDivide() {
		SuperSimpleCalculator ssc = new SuperSimpleCalculator(15, 3, "/");

		Integer result = ssc.calculate();

		assertThat(result).isEqualTo(5);
	}

	@Test
	public void shouldThrowException() {
		SuperSimpleCalculator ssc = new SuperSimpleCalculator(15, 3, "%");

		assertThatIllegalArgumentException()
				.isThrownBy(ssc::calculate)
				.withMessage("Operation '%' isn't supported");
	}
}
