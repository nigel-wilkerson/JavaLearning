package oopInterface;

//Description: Contract for any entity that holds a security clearance.
//             Defines methods for retrieving the current clearance level
//             and checking whether that level meets a required threshold.

public interface ClearanceHolder {

    String getClearanceLevel();

    boolean canAccess(String requiredLevel);
}
