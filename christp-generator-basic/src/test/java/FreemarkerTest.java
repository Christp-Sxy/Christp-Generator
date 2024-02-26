import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

/**
 * @projectName: christp-generator
 * @package: PACKAGE_NAME
 * @className: FreemarkerTest
 * @author: Christp
 * @description: TODO
 * @date: 2024/2/26 15:29
 * @version: 1.0
 */
public class FreemarkerTest {
    @Test
    public void test() throws IOException, TemplateException {
        // new出Configuration u第项，参数为 FreeMarker 版本号
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);

        // 指定模板文件所在的路径
        configuration.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));

        // 设置模板文件使用的字符集
        configuration.setDefaultEncoding("utf-8");

        // 创建模板对象，加载指定模板
        Template template = configuration.getTemplate("myweb.html.ftl");

        // 创建数据模型
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("currentYear", 2024);
        List<Map<String, Object>> menuItems = new ArrayList<>();
        Map<String, Object> menuItem2 = new HashMap<>();
        menuItem2.put("url", "https://www.bilibili.com/");
        menuItem2.put("label", "b站");
        menuItems.add(menuItem2);
        dataModel.put("menuItems", menuItems);

        // 生成
        Writer out = new FileWriter("myweb.html");
        template.process(dataModel, out);

        // 生成文件后关闭
        out.close();
    }

}
