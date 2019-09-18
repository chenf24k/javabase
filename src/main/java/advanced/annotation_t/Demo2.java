package advanced.annotation_t;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解信息，模拟处理注解信息的流程
 *
 * @author 陈枫 on 2019-09-09.
 */
public class Demo2 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("advanced.annotation_t.Student");
            // 获得类的所有有效注解
            Annotation[] annotations = c.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a);
            }

            //获取类指定注解
            Table table = (Table) c.getAnnotation(Table.class);
            System.out.println(table.value());

            // 获得类的属性的注解
            Field field = c.getDeclaredField("studentName");
            advanced.annotation_t.Field f = field.getAnnotation(advanced.annotation_t.Field.class);
            System.out.println(f.columnName() + "-" + f.type() + "-" + f.length());

            // 根据获取的表名字、字段信息，拼出DDL语句，然后使用JDBC执行这个SQL，在数据库中生成相关的表

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
