package com.simplified.springboot.Core;
import com.simplified.springboot.Select.ImportSelect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@ComponentScan
/**
 * 为了避免手动导入 配置类，这里使用 java spi机制实现 自动导入配置类全限定名
 */
@Import(ImportSelect.class)
public @interface SpringBootApplication {
}