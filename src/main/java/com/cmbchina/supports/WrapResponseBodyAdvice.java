package com.cmbchina.supports;

import com.cmbchina.exception.TopException;
import com.cmbchina.properties.WrapperProperties;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.cmbchina.constant.ReturnCodeEnum.SUCCESS;

@ControllerAdvice
public class WrapResponseBodyAdvice implements ResponseBodyAdvice<Object> {

    @Resource
    private WrapperProperties wrapperProperties;

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        Class<?> clazz = returnType.getMethod().getReturnType();
        return !clazz.equals(ResponseEntity.class);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        return wrapResultIfNecessary(body, returnType);
    }

    private Object wrapResultIfNecessary(Object body, MethodParameter returnType) {
        //全局异常拦截将拦截所有的异常并包装返回TopException
        if (body instanceof TopException) {
            return doWrap(null, ((TopException) body).getReturnCode(), ((TopException) body).getMessage(), false);
        }

        String className = returnType.getMethod().getDeclaringClass().getName();
        List<String> basePackages = wrapperProperties.getBasePackages();
        String successReturnCode = wrapperProperties.getSuccessReturnCode();

        //wrap the result if the api is ours
        for (String basePackage : basePackages) {
            if (className.contains(basePackage)) {
                return doWrap(body, StringUtils.isBlank(successReturnCode) ? SUCCESS.getReturnCode() : successReturnCode, SUCCESS.getReturnMsg(), true);
            }
        }
        return body;
    }

    private Map<String, Object> doWrap(Object data, String returnCode, String returnMessage, boolean isSuccess) {
        //对返回结果进行包装
        Map<String, Object> result = new HashMap<>();
        result.put(wrapperProperties.getData(), data);
        result.put(wrapperProperties.getReturnCode(), returnCode);
        result.put(wrapperProperties.getReturnMessage(), returnMessage);
//        if (wrapperProperties.getNeedSuccess()) {
//            result.put(wrapperProperties.getSuccess(), isSuccess);
//        }
        return result;
    }

}
