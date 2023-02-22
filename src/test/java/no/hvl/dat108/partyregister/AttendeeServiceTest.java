package no.hvl.dat108.partyregister;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AttendeeServiceTest {
    private String password = "TestPass1";
    private byte[] salt = RegistrationUtil.getSalt();
    private String passwordHash = RegistrationUtil.hashPassword(password, salt);
    private Attendee testAttendee1 = new Attendee("Ole", "Olesen", "12345678", passwordHash, salt, "M");
    private Attendee testAttendee2 = new Attendee("Per", "Persen", "12345679", passwordHash, salt, "M");
    private Attendee testAttendee3 = new Attendee("Kari", "Normann", "12345670", passwordHash, salt, "K");
    private Attendee testAttendee4 = new Attendee("Test", "Testsen", "12345677", passwordHash, salt, "M");

    @InjectMocks
    AttendeeService as;

    @Mock
    AttendeeRepo ar;

    @Test
    public void findAllAttendees() {


            //Arrange
        when(ar.findAll()).thenReturn(List.of(
                testAttendee1,
                testAttendee2,
                testAttendee3,
                testAttendee4));

        //Act
        List<Attendee> resultat = as.findAllAttendees();

        //Assert
        assertEquals(4, resultat.size());
        assertTrue(resultat.contains(testAttendee1));
        assertTrue(resultat.contains(testAttendee3));
    }

    @Test
    public void findByPhone() {

        when(ar.findByPhone("12345678")).thenReturn(testAttendee1);

        //Act
        Attendee resultat = as.findAttendeeWithPhone("12345678");

        //Assert
        assertTrue(resultat.getPhone().equals(testAttendee1.getPhone()));
    }


}
