package com.hcy.server.model.vo;

/**
 * @ClassName ResponseStatus
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2021/3/10 20:31
 * @Version 1.0
 **/

public enum  ResponseStatus {
    /**
     * 执行成功
     */
    RESPONSE_STATUS_SUCCESS(200, "执行成功"),
    RESPONSE_STATUS_FAILED(500,"出现异常");

    /**
     * 状态码
     */
    private long code;

    /**
     * 状态消息
     */
    private String message;

    ResponseStatus(long code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 获取状态码
     * @return
     */
    public long getCode() {
        return code;
    }

    /**
     * 获取消息
     * @return
     */
    public String getMessage() {
        return message;
    }
}
