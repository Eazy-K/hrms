package eazyk.hrms.core.utilities.result;

public class SuccessResult extends Result {
    public SuccessResult(boolean success) {
        super(success);
    }

    public SuccessResult(boolean success, String message) {
        super(success, message);
    }
}
