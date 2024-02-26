package com.christp.cli.example;

import com.sun.media.jfxmediaimpl.HostUtils;
import picocli.CommandLine;

/**
 * @projectName: christp-generator
 * @package: com.christp.cli.example
 * @className: ASCIIArt
 * @author: Christp
 * @description: TODO
 * @date: 2024/2/26 17:19
 * @version: 1.0
 */
@CommandLine.Command(name = "ASCIIArt", version = "ASCIIArt 1.0", mixinStandardHelpOptions = true)
public class ASCIIArt implements Runnable {

    @CommandLine.Option(names = {"-s", "--font-size"}, description = "Font size")
    int fontSize = 19;

    @CommandLine.Parameters(paramLabel = "<word>", defaultValue = "Hello, picocli", description = "Words to be translated into ASCII att.")
    private String[] words = {"Hello,", "picocli"};

    @Override
    public void run() {
        // 自己实现业务逻辑
        System.out.println("fontSize = " + fontSize);
        System.out.println("words = " + String.join(",", words));
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ASCIIArt()).execute(args);
        System.exit(exitCode);
    }
}
