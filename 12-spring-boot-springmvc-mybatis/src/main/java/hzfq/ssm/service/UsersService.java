package hzfq.ssm.service;

import java.util.List;

import hzfq.ssm.domain.Users;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
public interface UsersService {

    void addUser(Users users);

    List<Users> findUserAll();

    Users findUserById(Integer id);

    void updateUser(Users users);

    void deleteUserById(Integer id);
    
}
