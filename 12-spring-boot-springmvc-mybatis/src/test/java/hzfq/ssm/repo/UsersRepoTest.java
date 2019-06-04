package hzfq.ssm.repo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hzfq.ssm.App;
import hzfq.ssm.model.UsersMO;
import hzfq.ssm.util.SQLHelper;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月3日
 */
@SpringBootTest(classes = { App.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class UsersRepoTest {

    @Autowired
    private UsersRepo usersRepo;

    @Test
    public void queryAll() {
        List<Object[]> content = usersRepo.queryAll();
        System.out.println(SQLHelper.parse(content, UsersMO.class));
    }

}
