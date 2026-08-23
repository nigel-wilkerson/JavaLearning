package oopInterface;

// Description: Contract for any entity whose actions must be logged for
//             compliance purposes. Any class implementing this interface
//             promises to log actions as they occur.

public interface Auditable {

    void logAction(String action);
}
