package day18.enum_anno.anno;

import java.lang.annotation.*;

/**
 * @Author wsl
 * @Description 自定义注解
 *  没有成员定义的 Annotation 称为标记; 包含成员变量的 Annotation 称为元数据 Annotation
 */
//使用配置参数（参数名=参数值）
@MyAnnotation(value = "王莎丽")
public class MyAnnotationTest {
    public static void main(String[] args) {

        Annotation a = MyAnnotationTest.class.getAnnotation(MyAnnotation.class);
        MyAnnotation m = (MyAnnotation) a;
        System.out.println(m.value());
    }
}
//指定Annotation的声明周期
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

//定义Annotation类型 @interface
@interface MyAnnotation {

    //定义成员变量时为其指定初始值用default，配置参数
    //定义成员变量：类型 名字
    String value() default "wsl";
}
