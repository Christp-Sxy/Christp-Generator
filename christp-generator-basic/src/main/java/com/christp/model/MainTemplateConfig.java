package com.christp.model;

import lombok.Data;

/**
 * @projectName: christp-generator
 * @package: com.christp.model
 * @className: MainTemplateConfig
 * @author: Christp
 * @description: TODO
 * @date: 2024/2/26 16:23
 * @version: 1.0
 */
@Data
public class MainTemplateConfig {
    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author = "christp";

    /**
     * 输出信息
     */
    private String outputText = "sum = ";

}
