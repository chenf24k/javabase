package advanced.annotation_t;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author 陈枫 on 2019-09-09.
 */
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface CustomAnnotation {
    String value();
}
