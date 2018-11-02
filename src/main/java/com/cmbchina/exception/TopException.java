package com.cmbchina.exception;

public class TopException extends RuntimeException {

    private static final long serialVersionUID = -6302353437190476221L;

    private String returnCode;

    private String returnMsg;

    private TopException() {
    }

    public TopException(String returnCode, String returnMsg) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public String getReturnCode() {
        return returnCode;
    }

    @Override
    public String getMessage() {
        return returnMsg;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
