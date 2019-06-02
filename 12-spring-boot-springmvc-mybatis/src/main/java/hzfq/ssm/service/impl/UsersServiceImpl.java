package hzfq.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hzfq.ssm.domain.Users;
import hzfq.ssm.mapper.UsersMapper;
import hzfq.ssm.service.UsersService;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        usersMapper.insertUser(users);
    }

    @Override
    public List<Users> findUserAll() {
        return usersMapper.selectUsersAll();
    }

    @Override
    public Users findUserById(Integer id) {
        return usersMapper.selectUserById(id);
    }

    @Override
    public void updateUser(Users users) {
        usersMapper.updateUser(users);
    }

    @Override
    public void deleteUserById(Integer id) {
        usersMapper.deleteUserById(id);
    }

}
