package exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Any1Test {

	@Test
	public void testVeureMes() {
		Any1 mesosAny = new Any1();
		assertThrows (ArrayIndexOutOfBoundsException.class, () -> mesosAny.veureMes(13));
	}

}