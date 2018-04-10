package cn.wanlinus.springaop;

import cn.wanlinus.springaop.annotation.OwnAnnotation;
import org.springframework.stereotype.Component;

/**
 * @author wanli
 * @date 2018-04-10 19:40
 */
@Component
public class Foo {
    @OwnAnnotation(descript = "bar环绕")
    public int bar(int i) {
        return i + 1;
    }
}
