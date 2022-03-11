package csku.mockitodemo.loganalyzer;

public class LogAnalyzer {    // CUT

    private WebService service;

    public LogAnalyzer(WebService service) {
        this.service = service;
    }

    public void analyze(String fileName) {
        if (fileName.length() < 8)
            service.logError("Filename too short: "+fileName);
		// ...
    }
	// ...
}