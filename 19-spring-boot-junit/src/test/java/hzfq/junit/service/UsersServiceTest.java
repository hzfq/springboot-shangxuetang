package hzfq.junit.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hzfq.junit.App;

/**
 * SpringBoot测试类
 * <p>
 * {@code SpringJUnit4ClassRunner}用于整合JUnit和Spring环境
 *
 * {@code @SpringBootTest}指定当前类为SpringBoot的测试类,加载启动类用于启动SpringBoot框架
 *
 * JUnit与Spring整合{@code @ContextConfiguration("classpath:applicationContext.xml")}
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@SpringBootTest(classes = { App.class })
@RunWith(SpringJUnit4ClassRunner.class) // 启动器
public class UsersServiceTest {

    @Autowired
    private UsersServiceImpl usersServiceImpl;

    @Test
    public void addUser() {
        usersServiceImpl.addUser();
    }
}
