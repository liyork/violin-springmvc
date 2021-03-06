package com.wolf.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description:
 * <br/> Created on 2017/10/17 18:14
 *
 * @author 李超
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-dependency-injection.xml")
//@Import({DependenceInjection.class, ServiceImpl2.class})
public class InjectionTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private DependenceInjection dependenceInjection ;
    @Autowired
    private CycleDependenceInjection cycleDependenceInjection ;

    @Test
    public void testInject(){
//        dependenceInjection.test();

        cycleDependenceInjection.test();
    }
}
