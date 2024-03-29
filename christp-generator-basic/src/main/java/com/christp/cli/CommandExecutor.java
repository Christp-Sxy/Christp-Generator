package com.christp.cli;

import com.christp.cli.command.ConfigCommand;
import com.christp.cli.command.GenerateCommand;
import com.christp.cli.command.ListCommand;
import picocli.CommandLine;

/**
 * @projectName: christp-generator
 * @package: com.christp.cli
 * @className: CommandExecutor
 * @author: Christp
 * @description: TODO
 * @date: 2024/2/26 17:54
 * @version: 1.0
 */
@CommandLine.Command(name = "christp", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable{

    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());
    }

    @Override
    public void run() {
        // 不输入子命令时，给出友好提示
        System.out.println("请输入具体命令，或者输入 --help 查看命令提示");
    }

    /**
     * 执行命令
     *
     * @param args
     * @return
     */
    public Integer doExecute(String[] args){
        return commandLine.execute(args);
    }
}
