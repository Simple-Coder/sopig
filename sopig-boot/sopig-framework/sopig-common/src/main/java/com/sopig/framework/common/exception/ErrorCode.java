package com.sopig.framework.common.exception;

import lombok.Data;

/**
 * Created by dongxie on 2022/3/24.
 * 错误码对象
 */
@Data
public class ErrorCode {

    /**
     * 错误码
     */
    private final Integer code;
    /**
     * 错误提示
     */
    private final String msg;

    public ErrorCode(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }

}

