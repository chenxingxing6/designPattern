### Cglib动态代理-MethodInterceptor
1.完全不受代理类必须实现接口的限制。   
2.底层采用ASM字节码生成框架，使用字节码技术生成代理类，比java反射效率更高。  

---
### maven依赖包
```html
<dependency>  
    <groupId>cglib</groupId>  
    <artifactId>cglib</artifactId>   
    <version>2.2.2</version>   
</dependency>   
```
