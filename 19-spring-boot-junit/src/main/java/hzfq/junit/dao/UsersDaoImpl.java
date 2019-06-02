package hzfq.junit.dao;

import org.springframework.stereotype.Repository;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Repository
public class UsersDaoImpl {

    public void saveUser() {
        System.out.println("insert into users...");
    }
}
