/**
 In deze klasse staan een aantal fouten:
 - Overbodige methoden die niet nodig zijn voor dit probleem (YAGNI)
 - Bepaalde stukken worden in meerdere methodes herhaald (DRY)
 - Onnodig complexe logica (KISS)
 - Zorg dat je geen foutieve invoer kunt geven (enum)
 - Diverse clean code overtredingen
 Probeer deze klasse aan te passen zodat het wel aan de clean code principes voldoet.
 **/

public class ErrorProcessor {
    private String eM; // This is the error message
    private String eL; // This is the error level

    public ErrorProcessor(String errorLevel) {
        this.eL = errorLevel;
        this.eM = "";

        if (errorLevel.equals("LOW")) {
            eM = "Low level error. No action required.";
        } else if (errorLevel.equals("MEDIUM")) {
            eM = "Medium level error. Check the system logs.";
        } else if (errorLevel.equals("HIGH")) {
            eM = "High level error. Immediate action required!";
        } else if (errorLevel.equals("CRITICAL")) {
            eM = "Critical error! System shutting down!";
        }
    }

    public void print_de_em() {
        if (eL.equals("LOW")) {
            System.out.println("[LOW] " + eM);
        } else if (eL.equals("MEDIUM")) {
            System.out.println("[MEDIUM] " + eM);
        } else if (eL.equals("HIGH")) {
            System.out.println("[HIGH] " + eM);
        } else if (eL.equals("CRITICAL")) {
            System.out.println("[CRITICAL] " + eM);
        }
    }

    //TODO: nog even overleggen wat ze hier precies mee willen...
    public void doSomethingWithError() {
        if (eL.equals("LOW")) {
            System.out.println("No action required for low-level errors.");
        } else if (eL.equals("MEDIUM")) {
            System.out.println("Investigate the system, but no immediate action required.");
        } else if (eL.equals("HIGH")) {
            System.out.println("Act immediately! Check all systems.");
        } else if (eL.equals("CRITICAL")) {
            System.out.println("Shut down the system to prevent further damage.");
        }
    }

    public boolean isCritical() {
        return eL.equals("CRITICAL");
    }

    public boolean isHigh() {
        return eL.equals("HIGH");
    }

    public boolean isMedium() {
        return eL.equals("MEDIUM");
    }

    public boolean isLaag() {
        return eL.equals("LOW");
    }

    public static void main(String[] args) {
        ErrorProcessor lowError = new ErrorProcessor("LOW");
        lowError.print_de_em();
        lowError.doSomethingWithError();

        System.out.println("-----");

        ErrorProcessor mediumError = new ErrorProcessor("MEDIUM");
        mediumError.print_de_em();
        mediumError.doSomethingWithError();

        System.out.println("-----");

        ErrorProcessor highError = new ErrorProcessor("HIGH");
        highError.print_de_em();
        highError.doSomethingWithError();

        System.out.println("-----");

        ErrorProcessor invalidError = new ErrorProcessor("BANAAN");
        invalidError.print_de_em();
        invalidError.doSomethingWithError();

        System.out.println("-----");
    }
}
