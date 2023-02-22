package no.hvl.dat108.partyregister;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class LoggInnUtilTest {

    @InjectMocks
    private LoginUtil loginUtil;
    private HttpServletRequest mockedRequest = Mockito.mock(HttpServletRequest.class);
    private HttpSession mockedSession = Mockito.mock(HttpSession.class);

    private String password = "TestPass1";
    private byte[] salt = RegistrationUtil.getSalt();
    private String passwordHash = RegistrationUtil.hashPassword(password, salt);

    private Attendee testAttendee = new Attendee("Test", "Testesen", "12345678", passwordHash, salt, "M");
    @Test
    void testLogin() {
        //Check if user is logged in, when not logged in
        assertFalse(LoginUtil.isUserLoggedIn(mockedRequest.getSession()));

        Mockito.when(mockedRequest.getSession()).thenReturn(mockedSession);
        //Log in user
        LoginUtil.loginUser(mockedRequest, testAttendee);
    }

}
