package nl.nynkek.menstruatiedisk.exeptions;

import java.io.Serial;

public class IdNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public IdNotFoundException(Long id) {
        super("Cannot find disc with id: " + id);
    }
}
