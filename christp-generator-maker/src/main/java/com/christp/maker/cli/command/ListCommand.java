package com.christp.maker.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine;

import java.io.File;
import java.util.List;

/**
 * @projectName: christp-generator
 * @package: com.christp.cli.command
 * @className: ListCommand
 * @author: Christp
 * @description: TODO
 * @date: 2024/2/26 17:53
 * @version: 1.0
 */
@CommandLine.Command(name = "list", description = "查看文件列表", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable{
    @Override
    public void run() {
        String projectPath = System.getProperty("user.dir");
        // 整个项目的根路径
        File parentFile = new File(projectPath).getParentFile();
        // 输入路径
        String inputPath = new File(String.valueOf(parentFile)).getAbsolutePath();
        List<File> files = FileUtil.loopFiles(inputPath);
        for (File file:
             files) {
            System.out.println(file);
        }
    }
}
