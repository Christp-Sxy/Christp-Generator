package com.christp.maker.meta.enums;

import lombok.Getter;

/**
 * @projectName: christp-generator
 * @package: com.christp.maker.meta.enums
 * @className: ModelTypeEnum
 * @author: Christp
 * @description: TODO 模型类枚举
 * @date: 2024/2/27 19:44
 * @version: 1.0
 */
@Getter
public enum ModelTypeEnum {

    STRING("字符串", "String"),
    BOOLEAN("布尔值", "boolean");

    private final String text;
    private final String value;

    ModelTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

}