package com.cmbchina.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@ConfigurationProperties(prefix = "spring.web.wrapper")
@Configuration
public class WrapperProperties {

    private String returnCode = "returnCode";

    private String returnMessage = "returnMsg";

    private String data = "data";

    private Boolean needSuccess = false;

    private String success = "success";

    private String successReturnCode;

    private List<String> basePackages;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean getNeedSuccess() {
        return needSuccess;
    }

    public void setNeedSuccess(Boolean needSuccess) {
        this.needSuccess = needSuccess;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getSuccessReturnCode() {
        return successReturnCode;
    }

    public void setSuccessReturnCode(String successReturnCode) {
        this.successReturnCode = successReturnCode;
    }

    public List<String> getBasePackages() {
        return basePackages;
    }

    public void setBasePackages(List<String> basePackages) {
        this.basePackages = basePackages;
    }
}
