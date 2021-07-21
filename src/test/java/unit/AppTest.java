package unit;

import com.gmail.solovyov.daniil.App;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTest {

	@Test
	public void shouldInvokeRun() {
		Scanner scanner = new Scanner(new ByteArrayInputStream("3\r\n5\r\n-\r\n".getBytes()));
		PrintStream ps = mock(PrintStream.class);
		App app = new App(scanner, ps);

		assertThatCode(app::run).doesNotThrowAnyException();
		verify(ps).print("Введите первое число: ");
		verify(ps).print("Введите второе число: ");
		verify(ps).print("Введите операцию: ");
		verify(ps).printf("Результат: %d", -2);
	}

	@Test
	public void shouldInvokeMain() {
		System.setIn(new ByteArrayInputStream("1\r\n2\r\n+\r\n".getBytes(StandardCharsets.UTF_8)));

		assertThatCode(() -> App.main(null)).doesNotThrowAnyException();
	}
}
