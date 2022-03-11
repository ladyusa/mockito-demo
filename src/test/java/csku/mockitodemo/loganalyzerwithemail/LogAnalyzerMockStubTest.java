package csku.mockitodemo.loganalyzerwithemail;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class LogAnalyzerMockStubTest {

    @Test
    public void testAnalyzeWebServiceThrowsSendEmail() {
        // mock and stub creation
        WebService stubWeb = mock(WebService.class);
        EmailService mockEmail = mock(EmailService.class);

        // stubbing
        doThrow(new RuntimeException("fake exception"))
                .when(stubWeb).logError(anyString());

        // CUT and setting up + calling method under test
        LogAnalyzer analyzer = new LogAnalyzer(stubWeb, mockEmail);
        analyzer.analyze("abc.ext");

        // verify
        verify(mockEmail).send("abc@xyz.com", "subject", "fake exception");
    }
}
