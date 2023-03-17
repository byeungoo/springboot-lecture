package hello.boot;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 클래스 레벨에 붙을 때 TYPE
@Retention(RetentionPolicy.RUNTIME)
@Documented // 문서화되도록 어노테이션 추가
@ComponentScan
public @interface MySpringBootAnnotation {
}
