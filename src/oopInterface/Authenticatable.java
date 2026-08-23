package oopInterface;

// Description: Contract for any entity that can authenticate with credentials.
//             Any class implementing this interface promises to provide
//             login and logout behaviors.

public interface Authenticatable {

    boolean login(String username, String password);

    void logout();
}
