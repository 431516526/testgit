package com.jxd.dao.impl;

import com.jxd.dao.ICommandDao;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @ClassName CommandDaoImpl
 * @Description TODO
 * @Author Zhou Yang
 * @Date 2020/9/3 10:57
 */
@Repository
/*相当于<bean id="commandDao" class="com.jxd.dao.impl.CommandDaoImpl"></bean>*/
public class CommandDaoImpl implements ICommandDao {
    @Override
    public boolean addCommand() {
        return true;
    }
}
