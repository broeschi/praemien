package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import person.Person;



class PersonTest {

	@Test
	public void testPersonCreation() {
		Person person = new Person(1, "M�ller", "Hans", 1234567891);
		assertEquals("M�ller", person.getAdrName());
		assertEquals("Hans", person.getAdrVorname());
		assertEquals(Integer.valueOf(1234567891), person.getAdrLizenz());

	}

}
