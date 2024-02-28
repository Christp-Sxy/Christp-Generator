package com.christp.maker.meta;

/**
 * @projectName: christp-generator
 * @package: com.christp.maker.meta
 * @className: MetaException
 * @author: Christp
 * @description: TODO 元信息类异常
 * @date: 2024/2/27 19:44
 * @version: 1.0
 */
public class MetaException extends RuntimeException {

    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}