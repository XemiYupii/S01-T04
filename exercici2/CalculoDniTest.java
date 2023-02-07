package exercici2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CalculoDniTest {

	@ParameterizedTest
	@CsvSource({
	    "54182050, E",
	    "72280257, Y",
	    "79631570, L",
	    "27062440, N",
	    "30479580, W",
	    "16210191, K",
	    "46981480, R",
	    "73500099, M",
	    "86886462, Z",
	    "29334572, S"
	  })
	  void testCalculoLetra(int numeroDni, char lletraEsperada) {
		CalculoDni calculoDni = new CalculoDni();
	    char lletraDni = calculoDni.calcularLletraDni(numeroDni);
	    assertEquals(lletraEsperada, lletraDni);
	  }
	}
