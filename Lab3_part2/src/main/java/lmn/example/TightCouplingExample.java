package lmn.example;

import java.util.logging.Logger;


interface IPrinter {
    void print(String message);
}

// Implementation cụ thể
class ConsolePrinter implements IPrinter {
    private static final Logger logger = Logger.getLogger(ConsolePrinter.class.getName());

    public void print(String message) {
        logger.info(message);
    }
}

class Report {
    private final IPrinter printer;

    public Report(IPrinter printer) {
        this.printer = printer;
    }

    void generate() {
        printer.print("Generating report...");
    }
}
public class TightCouplingExample {
    public static void main(String[] args) {
        IPrinter printer = new ConsolePrinter();      // Có thể thay đổi bằng FilePrinter, MockPrinter, v.v.
        Report report = new Report(printer);          // Inject printer vào
        report.generate();
    }
}
