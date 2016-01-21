package com.lami.tuomatuo.base;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xujiankang on 2016/1/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring/spring-context.xml","/spring/spring-mvc.xml","/spring/spring-mybatis.xml","/spring/spring-scheduler.xml","/spring/redis-context.xml"})
public class AbstractBaseTest {
    protected   Logger logger = Logger.getLogger(getClass());
}
