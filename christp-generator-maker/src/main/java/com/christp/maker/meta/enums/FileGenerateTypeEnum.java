package com.christp.maker.meta.enums;

/**
 * @projectName: christp-generator
 * @package: com.christp.maker.meta.enums
 * @className: FileGenerateTypeEnum
 * @author: Christp
 * @description: TODO
 * @date: 2024/2/27 19:42
 * @version: 1.0
 */

import lombok.Getter;

/**
 * 文件生成类型枚举
 */
@Getter
public enum FileGenerateTypeEnum {

    DYNAMIC("动态", "dynamic"),
    STATIC("静态", "static");

    private final String text;
    private final String value;

    FileGenerateTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

}