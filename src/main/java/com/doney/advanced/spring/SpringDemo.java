package com.doney.advanced.spring;

import com.doney.advanced.exception.AppException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * Spring 的生命周期
 */
public class SpringDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();

    }

    public void tt(String name){
        Assert.notNull("213","不能为none");
        if(name == null ){
            throw new AppException(name);
        }
    }
}
