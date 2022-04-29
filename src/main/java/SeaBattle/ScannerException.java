package SeaBattle;

import java.io.IOException;
import java.io.StringReader;

public class ScannerException extends IOException {
    String description;
    public ScannerException (String description){
        super(description);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
