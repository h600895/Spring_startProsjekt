package no.hvl.dat108.partyregister;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {

    /*
     * Et gyldig telefonnummer består av nøyaktig åtte siffer (0-9).
     */
    @Test
    public void validPhoneNumberShouldBeOk() {
        assertTrue(InputValidator.isValidPhone("99999999"));
        assertTrue(InputValidator.isValidPhone("56789023"));
        assertFalse(InputValidator.isValidPhone("1"));
        assertFalse(InputValidator.isValidPhone("67a34b23"));
    }
    
    @Test
    public void norwegianLettersShouldBeAllowed() {
        assertTrue(InputValidator.isValidFirstName("ÆØÅæøå"));
    }
    
    @Test
    public void illegalPasswordsShouldNotBeOk() {
        assertFalse(InputValidator.isValidPassword(null));
        assertFalse(InputValidator.isValidPassword(""));
        assertFalse(InputValidator.isValidPassword("a"));
        assertFalse(InputValidator.isValidPassword("ABC1"));
    }

    @Test
    public void passwordsAreMaching() {
        assertFalse(InputValidator.isEqualPassword("Passord1234", "Passord123"));
        assertFalse(InputValidator.isEqualPassword("Passord123", "Passord1234"));
        assertFalse(InputValidator.isEqualPassword("Passord123", "Passord123"));
    }
}
