package com.cmbchina.constant;

public enum ReturnCodeEnum {

    SUCCESS("success", "操作成功"),
    FAIL("fail", "操作失败"),;

    private String returnCode;

    private String returnMsg;

    ReturnCodeEnum(String returnCode, String returnMsg) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }
}
