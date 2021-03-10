package com.hcy.server.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.security.provider.certpath.OCSPResponse;

import java.io.Serializable;

/**
 * @ClassName ResponseResult
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2021/3/10 20:20
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> implements Serializable {
    /**
     * 序列化UID
     */
    private static final long serialVersionUID = -3999803560577989187L;

    /**
     * 状态码
     */
    private long code;

    /**
     * 状态消息
     */
    private String message;

    /**
     * 返回对象
     */
    private T data;

    /**
     * 响应状态码
     * @param responseStatus
     * @param data
     */
    private ResponseResult(ResponseStatus responseStatus, T data) {
        this.code = responseStatus.getCode();
        this.message = responseStatus.getMessage();
        this.data = data;
    }

    /**
     * 成功
     * @param data 数据
     * @param  <T> data数据类型
     * @return ResponseResult<T>
     */
    public static<T> ResponseResult<T> success(T data){
        return new ResponseResult<T>(ResponseStatus.RESPONSE_STATUS_SUCCESS, data);
    }

    /**
     * 默认情况下执行成功
     * @param <T>
     * @return
     */
    public static<T> ResponseResult<T> success(){
        return new ResponseResult<T>(ResponseStatus.RESPONSE_STATUS_SUCCESS,null);
    }

    /**
     * 默认情况失败下执行
     * @param <T>
     * @return
     */
    public static<T> ResponseResult<T> fail(){
        return new ResponseResult<T>(ResponseStatus.RESPONSE_STATUS_FAILED,null);
    }

    /**
     * 执行失败
     * @param data
     * @param <T>
     * @return
     */
    public static<T> ResponseResult<T> fail(T data){
        return new ResponseResult<T>(ResponseStatus.RESPONSE_STATUS_FAILED, data);
    }
}
