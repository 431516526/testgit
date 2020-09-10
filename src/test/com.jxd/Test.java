package com.jxd;

import com.jxd.service.ICommandService;
import com.jxd.service.impl.CommandServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @ClassName Test
 * @Description TODO
 * @Author Zhou Yang
 * @Date 2020/9/3 10:25
 */
public class Test {
    @org.junit.Test
    public void sayHello(){
        /*加载spring的配置文件，ApplicationContext应用上下文
        * 他是BeanFactory的子接口，用于实例化bean*/
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        /*向spring要一个实例*/
        HelloWorld helloWorld=(HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(helloWorld.getName());
        helloWorld.sayHello();
    }
    @org.junit.Test
    public void  addCommand(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        ICommandService commandService=(ICommandService)applicationContext.getBean("commandServiceImpl");
        boolean isAdd=commandService.addCommand();
        System.out.println(isAdd);
        ICommandService commandService1=(ICommandService) applicationContext.getBean("commandServiceImpl");
        System.out.println(commandService==commandService1);
    }
}
