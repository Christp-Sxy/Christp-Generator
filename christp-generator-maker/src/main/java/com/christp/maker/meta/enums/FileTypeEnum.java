package com.christp.maker.meta.enums;

import lombok.Getter;

/**
 * @projectName: christp-generator
 * @package: com.christp.maker.meta.enums
 * @className: FileTypeEnum
 * @author: Christp
 * @description: TODO 文件类型枚举
 * @date: 2024/2/27 19:42
 * @version: 1.0
 */

@Getter
public enum FileTypeEnum {

    DIR("目录", "dir"),
    FILE("文件", "file");

    private final String text;
    private final String value;

    FileTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

}