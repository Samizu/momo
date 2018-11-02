package com.cmbchina.exception;

public class MoreThanOneOrderFoundException extends RuntimeException {
    public static final String EXCEPTION_MESSAGE = "无法找到订单，错误码:ORDER-CENTER-ERROR-0001";
}
