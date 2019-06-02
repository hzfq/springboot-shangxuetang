package hzfq.ssm.mapper;

import java.util.List;

import hzfq.ssm.domain.Users;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
public interface UsersMapper {

    void insertUser(Users users);

    List<Users> selectUsersAll();

    Users selectUserById(Integer id);

    void updateUser(Users users);

    void deleteUserById(Integer id);
}
