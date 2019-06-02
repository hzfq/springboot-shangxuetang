package hzfq.junit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hzfq.junit.dao.UsersDaoImpl;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Service
public class UsersServiceImpl {

    @Autowired
    private UsersDaoImpl usersDaoImpl;

    public void addUser() {
        usersDaoImpl.saveUser();
    }
}
