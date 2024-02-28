package com.christp.maker.generator;

import java.io.*;
import java.util.Map;

/**
 * @projectName: christp-generator
 * @package: com.christp.maker.generator
 * @className: JarGenerator
 * @author: Christp
 * @description: TODO
 * @date: 2024/2/27 19:40
 * @version: 1.0
 */
public class JarGenerator {

    public static void doGenerate(String projectDir) throws IOException, InterruptedException {
        // 清理之前的构建并打包
        String winMavenCommand = "cmd /c mvn.cmd clean package -DskipTests=true";
        String otherMavenCommand = "mvn clean package -DskipTests=true";
        // 注意不同操作系统，执行的命令不同，默认Windows系统
        String mavenCommand = winMavenCommand;

        // 这里一定要用空格拆分！
        ProcessBuilder processBuilder = new ProcessBuilder(mavenCommand.split(" "));
        processBuilder.directory(new File(projectDir));
        Map<String, String> environment = processBuilder.environment();
        System.out.println(environment);
        Process process = processBuilder.start();

        // 读取命令的输出
        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // 等待命令执行完成
        int exitCode = process.waitFor();
        System.out.println("命令执行结束，退出码：" + exitCode);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        doGenerate("F:/SXY/christp-generator/christp-generator-basic");
    }
}
