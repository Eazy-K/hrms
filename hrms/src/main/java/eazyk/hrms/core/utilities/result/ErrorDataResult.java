package eazyk.hrms.core.utilities.result;

public class ErrorDataResult<T> extends DataResult{
    public ErrorDataResult(T data, String message) {
        super(true, message ,data);
    }

    public ErrorDataResult(T data) {
        super(false,data);
    }

    public ErrorDataResult(String message) {
        super(false, message ,null);
    }

    public ErrorDataResult() {
        super(false, null);
    }




}
