package exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnyTest {

	@Test
	public void testMesosSize() {
		Any mesosAny = new Any()	;
		assertEquals (12, mesosAny.getMesos().size());
	}
	@Test
	public void testMesosNotNull() {
		Any mesosAny = new Any();
		assertNotNull (mesosAny.getMesos());
	}
	@Test
	public void testMesAgost() {
		Any mesosAny = new Any();
		assertEquals ("Agost", mesosAny.getMesos().get(8));
	}
	@Test
	public void testNotMesAgost() {
		Any mesosAny = new Any();
		assertNotEquals ("Agost", mesosAny.getMesos().get(8));
	}
	

}
//El metode TestMesAgost falla ja que el resultat esperat és el mes d'Agost però
//ens indica que a la posicio 8 es troba el mes de Setembre
