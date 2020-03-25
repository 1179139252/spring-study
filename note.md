## Spring自动装配xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>


</beans>
```

## 常用注解
- @Autowired 自动装配通过类型，名字
        如果@Autowired 不能唯一自动装配上属性，则需要通过 @Qualifier("vaule=xx")
- @Nullable 字段标记了这个注解，说明这个字段可以为null
- @Resource 自动装配通过名字，类型