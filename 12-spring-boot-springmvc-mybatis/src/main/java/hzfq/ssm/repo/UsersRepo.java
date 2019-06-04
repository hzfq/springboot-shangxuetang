package hzfq.ssm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hzfq.ssm.domain.Users;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月3日
 */
public interface UsersRepo extends JpaRepository<Users, Integer> {

    @Query(value = "select id user_id,name user_name,age user_age from users", nativeQuery = true)
    List<Object[]> queryAll();
}
