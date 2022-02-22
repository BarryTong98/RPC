package com.mszlu.rpc.annontation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
//这个是因为当consumer调用的过程中，不能使用@ComponentScan注解扫描到ms-rpc下的包
/*
*  Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(EnableHttpClient.class.getCanonicalName());
   找到Enable注解，获取其中的basePackage属性，此属性标明了@MsHttpClient所在的包
   Object basePackage = annotationAttributes.get("basePackage");
* */
public @interface EnableHttpClient {
    //扫包路径
    String basePackage();

}
