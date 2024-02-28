package com.christp.maker.generator.main;


/**
 * @projectName: christp-generator-maker
 * @package: com.christp.maker.generator.main
 * @className: MainGenerator
 * @author: Christp
 * @description: TODO
 * @date: 2024/2/26 23:07
 * @version: 1.0
 */
/**
 * 用于生成：代码生成器
 */
public class MainGenerator extends GenerateTemplate {

    @Override
    protected void buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        System.out.println("-- 不要生成精简版程序包啦！~~>_<~~");
    }
}
