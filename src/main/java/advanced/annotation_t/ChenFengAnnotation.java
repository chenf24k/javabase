package advanced.annotation_t;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 陈枫 on 2019-09-08.
 */

@Target(value = {ElementType.METHOD, ElementType.TYPE}) //使用在方法可类型上
@Retention(RetentionPolicy.RUNTIME)  //运行时有效
public @interface ChenFengAnnotation {
    String studentName() default "";   //参数，这里不是方法

    int age() default 0;

    int id() default -1;  //设置默认值为-1表示不存在

    String[] schools() default {"马剑大学", "诸暨大学"};
}
