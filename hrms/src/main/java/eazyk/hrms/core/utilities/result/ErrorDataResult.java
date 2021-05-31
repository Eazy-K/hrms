package eazyk.hrms.core.utilities.result;

public class ErrorDataResult<T> extends DataResult{
    public ErrorDataResult(boolean success, Object data) {
        super(false, data);
    }

    public ErrorDataResult(boolean success, String message, Object data) {
        super(false, message, data);
    }


    public ErrorDataResult(T data) {
        super(false, data);
    }


    public ErrorDataResult(String message) {
        super(false, message, null);
    }

    public ErrorDataResult() {
        super(false, null);
    }




}
