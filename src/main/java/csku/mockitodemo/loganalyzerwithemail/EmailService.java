package csku.mockitodemo.loganalyzerwithemail;

public interface EmailService {
    void send(String to, String subject, String body);
}
