public class RefactoredErrorProcessor {
    //renamed properties and created an enum for ErrorLevel with the errorMessage as parameter
    private final ErrorLevel errorLevel;

    //simplified constructor by using enum and extracted method
    public RefactoredErrorProcessor(ErrorLevel errorLevel) {
        this.errorLevel = errorLevel;
    }

    //renamed method and simplified method
    public void printError() {
        System.out.println("[" + errorLevel + "] " + errorLevel.getErrorMessage());
    }

    //renamed method and changed if-else for switch statement
    public void handleError() {
        switch (errorLevel) {
            case LOW:
                System.out.println("No action required for low-level errors.");
                break;
            case MEDIUM:
                System.out.println("Investigate the system, but no immediate action required.");
                break;
            case HIGH:
                System.out.println("Act immediately! Check all systems.");
                break;
            case CRITICAL:
                System.out.println("Shut down the system to prevent further damage.");
        }
    }

    //deleted unused methods isCritical, isLow, isMedium and isHigh (yagni)

    public static void main(String[] args) {
        RefactoredErrorProcessor lowProcessor = new RefactoredErrorProcessor(ErrorLevel.LOW);
        lowProcessor.printError();
        lowProcessor.handleError();

        System.out.println("\n-------------------\n");

        RefactoredErrorProcessor mediumProcessor = new RefactoredErrorProcessor(ErrorLevel.MEDIUM);
        mediumProcessor.printError();
        mediumProcessor.handleError();

        System.out.println("\n-------------------\n");

        RefactoredErrorProcessor highProcessor = new RefactoredErrorProcessor(ErrorLevel.HIGH);
        highProcessor.printError();
        highProcessor.handleError();

        System.out.println("\n--------------------\n");

        RefactoredErrorProcessor criticalProcessor = new RefactoredErrorProcessor(ErrorLevel.CRITICAL);
        criticalProcessor.printError();
        criticalProcessor.handleError();
    }
}
