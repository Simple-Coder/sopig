package com.sopig.framework.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by dongxie on 2022/3/24.
 * 通用枚举
 */
@Getter
@AllArgsConstructor
public enum CommonStatusEnum {
    ENABLE(0, "开启"),
    DISABLE(1, "关闭");

    /**
     * 状态值
     */
    private final Integer status;
    /**
     * 状态名
     */
    private final String name;

}
