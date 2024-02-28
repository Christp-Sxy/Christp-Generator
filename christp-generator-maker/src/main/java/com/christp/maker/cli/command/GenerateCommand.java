package com.christp.maker.cli.command;

import cn.hutool.core.bean.BeanUtil;
//import com.christp.maker.generator.file.MainGenerator;
import com.christp.maker.model.DataModel;
import com.christp.maker.generator.main.MainGenerator;
import lombok.Data;
import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @projectName: christp-generator
 * @package: com.christp.cli.command
 * @className: GenerateCommand
 * @author: Christp
 * @description: TODO
 * @date: 2024/2/26 17:53
 * @version: 1.0
 */
@CommandLine.Command(name = "generate", description = "生成代码", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {

    @CommandLine.Option(names = {"-l", "--loop"}, arity = "0..1", description = "是否循环", interactive = true, echo = true)
    private boolean loop;

    @CommandLine.Option(names = {"-a", "--author"}, arity = "0..1", description = "作者", interactive = true, echo = true)
    private String author = "christp";

    @CommandLine.Option(names = {"-o", "--outputText"}, arity = "0..1", description = "输出文本", interactive = true, echo = true)
    private String outputText = "sum = ";


    @Override
    public Integer call() throws Exception {
        DataModel mainTemplateConfig = new DataModel();
        BeanUtil.copyProperties(this, mainTemplateConfig);
        System.out.println("配置信息：" + mainTemplateConfig);
//        MainGenerator.doGenerate(mainTemplateConfig);
        return 0;
    }
}
