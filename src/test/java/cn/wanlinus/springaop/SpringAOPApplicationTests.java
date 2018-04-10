package cn.wanlinus.springaop;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAOPApplicationTests {

    @Autowired
    private Foo foo;

    /**
     * 输出结果为
     * 获取传入参数:	[7]
     * 获取注解描述信息:	bar环绕
     * 获取传出参数:	8 
     */
    @Test
    public void contextLoads() {
        Assert.assertEquals(8, foo.bar(7));
    }

}
