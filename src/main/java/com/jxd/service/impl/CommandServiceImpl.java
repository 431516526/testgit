package com.jxd.service.impl;

import com.jxd.dao.ICommandDao;
import com.jxd.dao.impl.CommandDaoImpl;
import com.jxd.service.ICommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @ClassName CommandServiceImpl
 * @Description TODO
 * @Author Zhou Yang
 * @Date 2020/9/3 10:56
 */
@Service
//相当于<bean id="commandService" scope="singleton" class="com.jxd.service.impl.CommandServiceImpl"> </bean>
public class CommandServiceImpl implements ICommandService {
    //ICommandDao iCommandDao = new CommandDaoImpl();
    /*将ICommandDao声明为其的一个私有属性*/
    @Autowired
  /* 或 @Resource*/
    //实现自动注入
    private ICommandDao commandDao;
    //CommandServiceImpl需要commandDao实例时，spring通过
    // 该方法将创建好的实例注入进来
    /*public void setCommandDao(ICommandDao commandDao) {
        this.commandDao = commandDao;
    }*/
    @Override
    public boolean addCommand() {
        return commandDao.addCommand();
    }
}
