import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 日志升级步骤
 * 1.当前只引入log4j，需要切换到logback；
 * 2.注释掉log4j，打开slf4j和logback依赖，依赖修改完毕，但代码报错因为之前import引入的还是log4j的类；
 *
 */
public class Log4jTest {

    // 定义 log4j 日志记录器
    public static final Logger LOGGER = Logger.getLogger(Log4jTest.class);

    // 测试桥接器
    @Test
    public void test01()throws Exception{
        LOGGER.info("hello lgo4j");
    }
}
