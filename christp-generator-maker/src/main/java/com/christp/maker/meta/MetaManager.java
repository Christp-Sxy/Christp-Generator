package com.christp.maker.meta;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;

/**
 * @projectName: christp-generator-maker
 * @package: com.christp.maker.meta
 * @className: MetaManager
 * @author: Christp
 * @description: TODO 单例模式实例化
 * @date: 2024/2/26 22:04
 * @version: 1.0
 */
public class MetaManager {

    // volatile，并发编程中常用的关键字，确保多线程环境下的内存可见性，这样meta一旦被修改，所有内存都能看见
    private static volatile Meta meta;

    public static Meta getMetaObject() {
        if (meta == null) {
            // 加锁
            synchronized (MetaManager.class) {
                if (meta == null) {
                    meta = initMeta();
                }
            }
        }
        return meta;
    }

    private static Meta initMeta() {
        String metaJson = ResourceUtil.readUtf8Str("meta.json");
        Meta newMeta = JSONUtil.toBean(metaJson, Meta.class);
        // 校验配置文件，处理默认值
        MetaValidator.doValidAndFill(newMeta);
        return newMeta;
    }
}
