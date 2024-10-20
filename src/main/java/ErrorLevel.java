public enum ErrorLevel {
    LOW("Low level error. No action required."),
    MEDIUM("Medium level error. Check the system logs."),
    HIGH("High level error. Immediate action required!"),
    CRITICAL("Critical error! System shutting down!");

    private final String errorMessage;

    ErrorLevel(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
